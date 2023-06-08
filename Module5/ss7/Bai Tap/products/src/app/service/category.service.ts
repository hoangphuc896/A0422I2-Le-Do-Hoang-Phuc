import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Category} from '../model/category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  private API = 'http://localhost:3000';
  categories: Category[] = [
    {
      idCategory: 1,
      nameCategory: 'IPhone 12'
    },
    {
      idCategory: 2,
      nameCategory: 'IPhone asd'
    }
  ];

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Category[]> {
    return this.http.get<Category[]>(this.API);
  }

  saveCategory(category: Category): Observable<Category> {
    return this.http.post<Category>(this.API , category);
  }

  findById(id: number): Observable<Category> {
    return this.http.get<Category>(this.API + `/category/${id}`);
  }

  updateCategory(id: number, category: Category): Observable<Category> {
    return this.http.put<Category>(this.API + `/category/${id}`, category);
  }

  deleteCategory(id: number): Observable<Category> {
    return this.http.delete<Category>(this.API + `/category/${id}`);
  }
}
