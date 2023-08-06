import { TestBed } from '@angular/core/testing';

import { BenhanService } from './benhan.service';

describe('BenhanService', () => {
  let service: BenhanService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BenhanService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
