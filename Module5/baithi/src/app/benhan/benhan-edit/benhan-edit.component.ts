import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {BenhanService} from '../../service/benhan.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-benhan-edit',
  templateUrl: './benhan-edit.component.html',
  styleUrls: ['./benhan-edit.component.css']
})
export class BenhanEditComponent implements OnInit {
  benhAnForm: FormGroup = new FormGroup({
      maBenhAn: new FormControl(),
      maBenhNhan: new FormControl(),
      tenBenhNhan: new FormControl(),
      ngayNhapVien: new FormControl('', [Validators.pattern('dd-MM-yyyy')]),
      ngayraVien: new FormControl('', [Validators.pattern('dd-MM-yyyy')]),
      lyDo: new FormControl(),
      phuongPhap: new FormControl(),
      bacSi: new FormControl()
    }
  );
  id: number;

  constructor(private benhAnService: BenhanService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getBenhAn(this.id);
    });
  }

  ngOnInit(): void {
  }

  getBenhAn(id: number) {
    return this.benhAnService.findByIdProduct(id).subscribe(benhAn => {
      this.benhAnForm = new FormGroup({
        maBenhAn: new FormControl(benhAn.maBenhAn),
        maBenhNhan: new FormControl(benhAn.maBenhNhan),
        tenBenhNhan: new FormControl(benhAn.tenBenhNhan),
        ngayNhapVien: new FormControl(benhAn?.ngayNhapVien),
        ngayraVien: new FormControl(benhAn?.ngayRaVien),
        lyDo: new FormControl(benhAn.lyDo),
        phuongPhap: new FormControl(benhAn.phuongPhap),
        bacSi: new FormControl(benhAn.bacSi)
      });
    });
  }

  updateBenhAn(id: number) {
    const product = this.benhAnForm.value;
    this.benhAnService.updateProduct(id, product).subscribe(next => {
      alert('Bạn Cập Nhập Thành Công');
      this.router.navigateByUrl('/benhan/list');
    });
  }
}
