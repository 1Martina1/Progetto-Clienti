import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormRicercaComponent } from './form-ricerca.component';

describe('FormRicercaComponent', () => {
  let component: FormRicercaComponent;
  let fixture: ComponentFixture<FormRicercaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormRicercaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormRicercaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
