import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Item, ItemResponse } from '../models/item';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  private api = 'http://localhost:8081/api/items';

  constructor(
    private http: HttpClient
  ) {}

  getItems(): Observable<ItemResponse[]> {

    return this.http.get<ItemResponse[]>(this.api);
  }

  createItem(item: Item): Observable<Item> {
    console.log('Creating item:', item);
    return this.http.post<Item>(
      this.api,
      item
    );
  }
}