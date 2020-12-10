import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }
  public register(holder: AccountHolder): Observable<AccountHolder> {
    return this.http.post<AccountHolder>(`${environment.baseUrl}/${environment.registerUrl}`, holder);
  }
  public register(holder: AccountHolder): Observable<AccountHolder> {
    return this.http.post<AccountHolder>(`${environment.baseUrl}/${environment.registerUrl}`, holder);
  }
    public register(holder: AccountHolder): Observable<AccountHolder> {
      return this.http.post<AccountHolder>(`${environment.baseUrl}/${environment.registerUrl}`, holder);
  }
  public register(holder: AccountHolder): Observable<AccountHolder> {
    return this.http.post<AccountHolder>(`${environment.baseUrl}/${environment.registerUrl}`, holder);
  }
  public register(holder: AccountHolder): Observable<AccountHolder> {
    return this.http.post<AccountHolder>(`${environment.baseUrl}/${environment.registerUrl}`, holder);
  }
}
