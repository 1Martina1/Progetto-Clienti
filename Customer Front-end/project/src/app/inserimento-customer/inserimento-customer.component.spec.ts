import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InserimentoCustomerComponent } from './inserimento-customer.component';

describe('InserimentoCustomerComponent', () => {
  let component: InserimentoCustomerComponent;
  let fixture: ComponentFixture<InserimentoCustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InserimentoCustomerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InserimentoCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
