import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CategoryService} from '../../service/category.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-category-create',
  templateUrl: './category-create.component.html',
  styleUrls: ['./category-create.component.css']
})
export class CategoryCreateComponent implements OnInit {
  categoryForm: FormGroup = new FormGroup({
    nameCategory: new FormControl(),
  });

  constructor(private categoryService: CategoryService,
              private router: Router) {
  }

  ngOnInit(): void {
  }

  submit() {
    const category = this.categoryForm.value;
    console.log(category);
    this.categoryService.createCategory(category).subscribe(() => {
        this.categoryForm.reset();
        alert('tạo thành công');
        this.router.navigateByUrl('/category/list');
      }, e => {
        console.log(e);
      }
    );
  }
}
