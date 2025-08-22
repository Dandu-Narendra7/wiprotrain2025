import { Routes } from '@angular/router';
import { Produclist } from './produclist/produclist';
import { Productadd } from './productadd/productadd';
import { Productedit } from './productedit/productedit';
import { Productdelete } from './productdelete/productdelete';

export const routes: Routes = [
      { path: '', component: Productedit },
 { path: 'productlist', component: Produclist },
 { path: 'productadd', component: Productadd },
{ path: 'productedit/:id', component: Productedit },
{ path: 'productdelete/:id', component: Productdelete }
];
