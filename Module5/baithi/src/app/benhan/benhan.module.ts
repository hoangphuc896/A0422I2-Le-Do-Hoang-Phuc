import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BenhanRoutingModule } from './benhan-routing.module';
import { BenhanEditComponent } from './benhan-edit/benhan-edit.component';
import { BenhanListComponent } from './benhan-list/benhan-list.component';
import {ReactiveFormsModule} from '@angular/forms';


@NgModule({
  declarations: [BenhanEditComponent, BenhanListComponent],
    imports: [
        CommonModule,
        BenhanRoutingModule,
        ReactiveFormsModule
    ]
})
export class BenhanModule { }
