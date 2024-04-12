import React, { useState } from 'react';
import { useDispatch } from 'react-redux';

const UserDetailsForm = () => {
  const dispatch = useDispatch();
  const [name, setName] = useState('');
  const [address, setAddress] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    dispatch({
      type: 'UPDATE_USER_DETAILS',
      payload: {
        name,
        address
      }
    });
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        placeholder="Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <input
        type="text"
        placeholder="Address"
        value={address}
        onChange={(e) => setAddress(e.target.value)}
      />
      <button type="submit">Update Details</button>
    </form>
  );
};

export default UserDetailsForm;