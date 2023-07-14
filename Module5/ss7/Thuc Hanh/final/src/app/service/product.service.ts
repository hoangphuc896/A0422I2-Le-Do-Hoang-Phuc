import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Category} from '../model/category';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [{
    id: 1,
    name: 'vip',
    price: 123,
    description: 'vip',
    category: {
      id: 1,
      nameCategory: 'anhdaipro'
    }
  }];

  private API = 'http://localhost:3000';

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Product[]> {
    return this.http.get<Product[]>(this.API + '/products');
  }

  createProduct(product: Product): Observable<Product> {
    return this.http.post<Product>(this.API + '/products', product);
  }

  findByIdProduct(id: number): Observable<Product> {
    return this.http.get<Product>(this.API + `/products/${id}`);
  }

  updateProduct(id: number, product: Product): Observable<Product> {
    return this.http.put<Product>(this.API + '/products/'  + id, product);
  }

  deleteProduct(id: number): Observable<Product> {
    return this.http.delete<Product>(this.API + `/products/${id}`);
  }

  search(input: string): Observable<Product[]> {
    return this.http.get<Product[]>(this.API + '/products?q=' + input);
  }
}

