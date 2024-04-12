import React from 'react';
import DataFetcher from './DataFetcher.js';
import { Provider } from 'react-redux';
import store from './store';
import UserDetailsForm from './UserDetailsForm';

function Users() {
  return (
    <div>
      <h2>Users</h2>
      <div><DataFetcher/></div>
      <Provider store={store}>
       <UserDetailsForm />
      </Provider>
    </div>
  );
}

export default Users;