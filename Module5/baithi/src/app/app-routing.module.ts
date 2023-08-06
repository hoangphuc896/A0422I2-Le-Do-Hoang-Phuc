import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {BenhanListComponent} from './benhan/benhan-list/benhan-list.component';
import {BenhanEditComponent} from './benhan/benhan-edit/benhan-edit.component';


const routes: Routes = [
  {
    path: 'benhan/list',
    component: BenhanListComponent
  },
  {
    path: 'benhan/edit/:id',
    component: BenhanEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
