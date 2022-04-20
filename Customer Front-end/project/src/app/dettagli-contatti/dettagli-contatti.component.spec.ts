import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DettagliContattiComponent } from './dettagli-contatti.component';

describe('DettagliContattiComponent', () => {
  let component: DettagliContattiComponent;
  let fixture: ComponentFixture<DettagliContattiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DettagliContattiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DettagliContattiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
