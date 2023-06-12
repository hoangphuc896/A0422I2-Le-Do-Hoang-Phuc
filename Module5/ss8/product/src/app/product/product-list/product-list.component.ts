import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {Category} from '../../model/category';
import {CategoryService} from '../../service/category.service';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[];
  categories: Category[];
  product: Product;
  p = 1;
  msg = false;


  constructor(private productService: ProductService,
              private categoryService: CategoryService) {
  }

  ngOnInit(): void {
    this.getAll();
    this.getAllCategory();
  }

  getAll() {
    this.productService.getAll().subscribe(products => {
      this.products = products;
    });
  }

  getAllCategory() {
    this.categoryService.getAll().subscribe(categories => {
      this.categories = categories;
    });
  }

  deleteProduct() {
    this.productService.deleteProduct(this.product.id).subscribe(() => {
      Swal.fire({
        position: 'top-right',
        icon: 'success',
        title: 'Xóa thành công',
        showConfirmButton: false,
        timer: 1500
      });
      this.getAll();
    });
  }

  getProductId(id: number) {
    this.productService.findByIdProduct(id).subscribe(data => {
      this.product = data;
    });
  }

  search(input: HTMLInputElement) {
    if (input.value === '') {
      this.msg = true;
    } else {
      this.productService.search(input.value).subscribe(next => {
          this.products = next;
          if (this.products.length === 0) {
            this.msg = true;
          } else {
            this.msg = false;
          }
        }
      );
    }
  }
}
