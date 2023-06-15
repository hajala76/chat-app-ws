import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MessagesComponent } from './messages.component';

import { FormsModule } from '@angular/forms';
import { SharedModule } from '../../shared/module/shared.module';

@NgModule({
  declarations: [
    MessagesComponent
  ],
  imports: [
    CommonModule,
    SharedModule,
    FormsModule
  ],
  exports: [MessagesComponent]
})
export class MessagesModule { }
