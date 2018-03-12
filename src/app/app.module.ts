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
import { SideMenuComponent } from '../Componentes/side-menu/side-menu.component';
//PrimeNg
import { ToolbarModule } from 'primeng/toolbar';
import { ButtonModule } from 'primeng/button';
import { SidebarModule } from 'primeng/sidebar';
import { CardModule } from 'primeng/card';
//Outros Componentes
import { DragulaModule } from '../../node_modules/ng2-dragula/ng2-dragula'
//Rotas
import { RotasModule } from './rotas.module';




@NgModule({
  declarations: [
    AppComponent,
    MainPage,
    HeaderComponent,
    SideMenuComponent,
    LoginPage
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    NoopAnimationsModule,
    RotasModule,
    FormsModule,
//Dragula
    DragulaModule,
//PrimeNg
    ToolbarModule,
    ButtonModule,
    SidebarModule,
    CardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
