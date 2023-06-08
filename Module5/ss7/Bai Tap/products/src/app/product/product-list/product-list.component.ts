import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../service/product.service';
import { Product } from '../../model/product';


@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  product: Product;

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.products = this.productService.getAll();
  }

  delete() {
    this.product = this.productService.findbyId(this.product.id);
    this.productService.deleteProduct(this.product.id);
    this.products = this.productService.getAll();
  }

  getById(id: number) {
    this.product = this.productService.findbyId(id);
  }
}
