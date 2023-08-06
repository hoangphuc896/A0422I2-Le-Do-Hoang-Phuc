import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {Benhan} from '../model/benhan';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BenhanService {
  private API = 'http://localhost:3000';

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Benhan[]> {
    return this.http.get<Benhan[]>(this.API + '/benhAn');
  }
  updateProduct(id: number, benhan: Benhan): Observable<Benhan> {
    return this.http.put<Benhan>(this.API + '/benhAn/'  + id, benhan);
  }
  deleteProduct(id: number): Observable<Benhan> {
    return this.http.delete<Benhan>(this.API + `/benhAn/${id}`);
  }

  findByIdProduct(id: number): Observable<Benhan> {
    return this.http.get<Benhan>(this.API + `/benhAn/${id}`);
  }
}
