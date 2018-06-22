# Weekend Homework - CodeClan Towers

You are being asked to model a hotel. This hotel will contain a collection of rooms of different types (e.g. bedrooms, conference rooms, dining rooms).

Each room will have at least a capacity and a collection of guests.


## MVP

1. Create an abstract `Room` superclass which will contain the properties/methods common to all Rooms.

2. Create different types of rooms which inherit from the `Room` superclass and have properties/methods of their own. (___HINT:___ you may wish to use an enum for the bedroom types with each entry having a value for the room capacity)

  - `Bedroom`, which will have a room number, a type e.g. Single/Double,  and nightly rate.

  - `ConferenceRoom`, which will have a name and a daily rate.

  - `Bedroom`s and `ConferenceRoom`s will be chargeable while others (e.g. dining rooms) may not.

3. Create a `Guest` class so that guests can be checked in/out of rooms.

4. Create a `Hotel` class, which has collections of rooms of different types.

5. The hotel will be able check guests in/out of rooms.

6. The hotel will be able to get a list of guest(s), if any, checked into a particular room.

### Possible Extensions

1. Add functionality to the hotel so it can see a list of vacant bedrooms.
2. Add functionality to check in guests to bedrooms for a number of nights.
3. Any other extensions you may wish to add.

#### Remember
Use TDD, with separate test files for each class.

## PDA Reminder

Remember to gather evidence for your PDA this week. This should only take 5 minutes:

- Go to your [PDA Checklist](https://github.com/codeclan/pda/blob/master/Student%20Checklist/Student%20Checklist.pdf)

- Submit your PDA evidence (screenshots, etc.) to your own PDA repo
