// store.js
import { createStore } from 'redux';

// Initial state
const initialState = {
  user: {
    name: '',
    email: ''
  }
};

// Reducer
const userReducer = (state = initialState, action) => {
  switch (action.type) {
    case 'UPDATE_USER_DETAILS':
      return {
        ...state,
        user: {
          ...state.user,
          ...action.payload
        }
      };
    default:
      return state;
  }
};

// Create Redux store
const store = createStore(userReducer);

export default store;