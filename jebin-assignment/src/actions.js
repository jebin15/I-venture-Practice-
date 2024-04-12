export const updateUser = (userId, updatedDetails) => ({
    type: 'UPDATE_USER',
    payload: { userId, updatedDetails }
  });