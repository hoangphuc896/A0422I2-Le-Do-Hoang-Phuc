import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Category} from '../model/category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private API = 'http://localhost:3000';

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Category[]> {
    return this.http.get<Category[]>(this.API + '/categories');
  }

  createCategory(category: Category): Observable<Category> {
    return this.http.post<Category>(this.API + '/categories', category);
  }

  findByIdCategory(id: number): Observable<Category> {
    return this.http.get<Category>(this.API + `/categories/${id}`);
  }

  updateCategory(id: number, category: Category): Observable<Category> {
    return this.http.put<Category>(this.API + `/categories/${id}`, category);
  }

  deleteCategory(id: number): Observable<Category> {
    return this.http.delete<Category>(this.API + `/categories/${id}`);
  }
}
