import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Category} from '../../model/category';
import {ProductService} from '../../service/product.service';
import {CategoryService} from '../../service/category.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  productForm: FormGroup = new FormGroup({
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  });
  categories: Category[];

  constructor(private productService: ProductService,
              private categoriesService: CategoryService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.productForm = new FormGroup({
      name: new FormControl('', [Validators.required]),
      price: new FormControl('', [Validators.required]),
      description: new FormControl('', [Validators.required]),
      category: new FormControl('', [Validators.required])
    });
    this.getAllCategory();
  }

  submit() {
    debugger
    const product = this.productForm.value;
    this.productService.createProduct(product).subscribe(() => {
      alert('Tạo thành công');
      this.productForm.reset();
      this.router.navigateByUrl('/product/list');
    }, e => console.log(e));
  }

  getAllCategory() {
    this.categoriesService.getAll().subscribe(categoires => {
      this.categories = categoires;
    });
  }
}
