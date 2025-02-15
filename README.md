# RedisInSpring

### Why Redis server?
1. In memory db, so retrieve data faster
2. Used as cache to store data temporarily to provide faster access to frequently used data

### Caching
1. After applying cache when the API is hit for the 1st time, it extracts data from db and save to the cache, so takes longer time

![highrts](https://github.com/user-attachments/assets/a903f01e-2438-407a-b9b8-3f1a5cbc02aa)

![image](https://github.com/user-attachments/assets/6a58ef6f-6814-49f4-bfa0-a6dc57b03ec4)


2. Wnen the API is hit for the 2nd time, if the same data is to be retrieved that was cached before, it will come from the cache and not be extracted from the db, so takes less time

![lessrts](https://github.com/user-attachments/assets/46ea7449-9afe-4648-b34d-8d59a05e7bda)

![image](https://github.com/user-attachments/assets/fff590d0-70ae-43e6-be23-89170b7056d8)
