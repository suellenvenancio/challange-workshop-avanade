import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Item, ItemResponse } from '../models/item';
import { ItemService } from '../service/item.service';
 

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './app.html',
})
export class App implements OnInit {

  items: ItemResponse[] = [];

  item: Item = { 
    name: '',
    category: '',
    quantity: 0 
  };

  constructor(
    private itemService: ItemService
  ) {}

  ngOnInit(): void {
    this.loadItems();
  }

 loadItems() {
  this.itemService.getItems().subscribe(data => {
    this.items = [...data];
  });
}

  saveItem() {

    this.itemService.createItem(this.item)
      .subscribe(() => {

        this.loadItems();

        this.item = { 
            name: '',
            category: '',
            quantity: 0 
        };

      });
  }
}