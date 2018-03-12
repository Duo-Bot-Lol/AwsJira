import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';

//Paginas
import { AppComponent } from './app.component';
import { MainPage } from '../Paginas/main/main.component';
import { LoginPage } from '../Paginas/login/login.component';
//Componentes
import { HeaderComponent } from '../Componentes/header/header.component';
//Rotas
import { RotasModule } from './rotas.module';



@NgModule({
  declarations: [
    AppComponent,
    MainPage,
    HeaderComponent,
    LoginPage
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    NoopAnimationsModule,
    RotasModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
