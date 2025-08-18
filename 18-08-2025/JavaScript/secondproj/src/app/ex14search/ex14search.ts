import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex14search',
  imports: [FormsModule],
  templateUrl: './ex14search.html',
  styleUrl: './ex14search.css'
})
export class Ex14search {
  names = ['Jayanth', 'Mahesh', 'Rajesh', 'Narendra', 'Rakesh'];
  searchText = '';
  get filteredNames() {
    const text = this.searchText.toLowerCase();
    return this.names.filter(name => name.toLowerCase().includes(text));
  }


}
