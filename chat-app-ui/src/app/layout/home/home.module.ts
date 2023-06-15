import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { HomeComponent } from './home.component';
import { FormsModule } from '@angular/forms';
import { SharedModule } from '../../shared/module/shared.module';
import { UsersListModule } from '../users-list/users-list.module';
import { MessagesModule } from '../messages/messages.module';

@NgModule({
  declarations: [
    HomeComponent
  ],
  imports: [
    CommonModule,
    HomeRoutingModule,
    FormsModule,
    SharedModule,
    UsersListModule,
    MessagesModule
  ]
})
export class HomeModule { }
