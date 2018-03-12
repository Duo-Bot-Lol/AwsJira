import { Component, OnInit } from '@angular/core';
import { DragulaService } from 'ng2-dragula';
import { DragulaDirective } from 'ng2-dragula/components/dragula.directive';
@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainPage implements OnInit {
  options: any = {
    removeOnSpill: false,
    copy: false
  }
  MagiaGrimorio = []
  MagiaGrimorio2 = []
  MagiaPlayer = []
  MagiaPlayer2 = []
  constructor() { 
    this.start()
  }

  ngOnInit() {
  }

  start() {
    this.MagiaGrimorio = [{
      nome: 'HATE THIS'},
    { nome: 'Hate hdhjsdh' },
    { nome: 'Omega Max Megazord' }]
  
  this.MagiaGrimorio2 = [{
    nome: 'HATE THIS'},
  { nome: 'Hate hdhjsdh' },
  { nome: 'Omega Max Megasasazord' }]
}





}
