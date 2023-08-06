import {Component, OnInit} from '@angular/core';
import {CategoryService} from '../../service/category.service';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-category-update',
  templateUrl: './category-update.component.html',
  styleUrls: ['./category-update.component.css']
})
export class CategoryUpdateComponent implements OnInit {
  categoryForm: FormGroup = new FormGroup({
    id: new FormControl(),
    nameCategory: new FormControl(),
  });
  id: number;

  constructor(private categoryService: CategoryService,
              private activatedRoute: ActivatedRoute,
              private router: Router
  ) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getCategory(this.id);
    });
  }

  ngOnInit(): void {
  }

  getCategory(id: number) {
    return this.categoryService.findByIdCategory(id).subscribe(category => {
      this.categoryForm = new FormGroup({
        nameCategory: new FormControl(category.nameCategory),
      });
    });
  }

  updateCategory(id: number) {
    const category = this.categoryForm.value;
    this.categoryService.updateCategory(id, category).subscribe(() => {
      alert('Cập Nhập Thành Công');
      this.router.navigateByUrl('/category/list');
    }, e => {
      console.log(e);
    });
  }
}
