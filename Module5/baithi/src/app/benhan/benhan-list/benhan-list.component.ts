import {Component, OnInit} from '@angular/core';
import {Benhan} from '../../model/benhan';
import {BenhanService} from '../../service/benhan.service';


@Component({
  selector: 'app-benhan-list',
  templateUrl: './benhan-list.component.html',
  styleUrls: ['./benhan-list.component.css']
})
export class BenhanListComponent implements OnInit {
  benhAns: Benhan[];
  benhAn: Benhan;

  constructor(private benhAnService: BenhanService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.benhAnService.getAll().subscribe(benhAns => {
      this.benhAns = benhAns;
    });
  }

  deleteBenhAn() {
    this.benhAnService.deleteProduct(this.benhAn.id).subscribe(() => {
      this.getAll();
    });
  }

  getProductId(id: number) {
    this.benhAnService.findByIdProduct(id).subscribe(data => {
      this.benhAn = data;
    });
  }
}
