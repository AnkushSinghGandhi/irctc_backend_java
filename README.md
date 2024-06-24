<a href="https://warriorwhocodes.com"><img src="repo_images/header.jpg"></a>

<p align="center">
  <a href="https://ankushsinghgandhi.github.io">
    <img src="https://img.shields.io/badge/Website-3b5998?style=flat-square&logo=google-chrome&logoColor=white" />
  </a>
  <a href="http://twitter.com/ankushsgandhi">
    <img src="https://img.shields.io/badge/-Twitter-blue?style=flat-square&logo=twitter&logoColor=white" />
  </a>
   <a href="https://www.linkedin.com/in/ankush-singh-gandhi-2487771aa/">
    <img src="https://img.shields.io/badge/-LinkedIn-0e76a8?style=flat-square&logo=Linkedin&logoColor=white" />
  </a>
  <a href="https://dev.to/@ankushsinghgandhi">
    <img src="https://img.shields.io/badge/-Dev.to-grey?style=flat-square&logo=dev.to&logoColor=white"/>
  </a>
  <a href="https://stackoverflow.com/users/13790266/ankush-singh">
    <img src="https://img.shields.io/badge/-Stackoverflow-orange?style=flat-square&logo=stackoverflow&logoColor=white"/>
  </a>
  <a href="https://leetcode.com/ankushsinghgandhi/">
    <img src="https://img.shields.io/badge/-Leetcode-yellow?style=flat-square&logo=Leetcode&logoColor=white"/>
  </a>
    <a href="https://www.hackerrank.com/ankushsgandhi">
    <img src="https://img.shields.io/badge/-HackerRank-green?style=flat-square&logo=Hackerrank&logoColor=white"/>
  </a>
    <a href="https://www.hackerearth.com/@bhanusinghank">
    <img src="https://img.shields.io/badge/-Hackerearth-purple?style=flat-square&logo=Hackerearth&logoColor=white"/>
  </a>
</p>

# IRCTC Backend Project

## Project Overview

The IRCTC Backend Project is a Java based application designed to facilitate train ticket booking. It supports user sign-up, login, fetching bookings, searching for trains, booking seats, and canceling bookings. The application simulates a real-world train booking system, providing users with a simple and intuitive interface to manage their train journeys.

## Features

1. **User Signup**: New users can create an account by providing a username and password.
2. **User Login**: Existing users can log in to their accounts.
3. **Fetch Bookings**: Users can retrieve their current bookings.
4. **Search Trains**: Users can search for trains between two stations.
5. **Book a Seat**: Users can book a seat on a selected train.
6. **Cancel Booking**: Users can cancel their bookings.
7. **Exit**: Users can exit the application.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- An Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse
- Internet connection (for Maven dependencies)

## Project Structure

- `App.java`: The main entry point of the application.
- `entities/Train.java`: Represents the Train entity.
- `entities/User.java`: Represents the User entity.
- `entities/Ticket.java`: Represents the Ticket entity.
- `services/UserBookingService.java`: Provides services for user operations like sign-up, login, booking, etc.
- `services/TrainService.java`: Provides services for train operations like add train, update train, etc.
- `util/UserServiceUtil.java`: Contains utility methods for user services.

## Installation

1. **Clone the repository**:

    ```bash
    git clone https://github.com/AnkushSinghGandhi/irctc_backend_java.git
    ```

2. **Navigate to the project directory**:

    ```bash
    cd irctc-backend
    ```

3. **Open the project in your IDE**:

    - Open your preferred IDE.
    - Import the project as a Maven project.

4. **Build the project**:

    - In your IDE, build the project to resolve all dependencies.

## Running the Application

1. **Run `App.java`**:

    - In your IDE, navigate to the `App.java` file.
    - Right-click and select `Run 'App.main()'`.

2. **Interacting with the Application**:

    - Follow the on-screen prompts to sign up, log in, search for trains, book seats, and manage your bookings.

## Usage

1. **Sign Up**:

    - Select option `1` to sign up.
    - Enter a username and password to create a new account.

2. **Login**:

    - Select option `2` to log in.
    - Enter your username and password to access your account.

3. **Fetch Bookings**:

    - Select option `3` to fetch your current bookings.

4. **Search Trains**:

    - Select option `4` to search for trains.
    - Enter the source and destination stations.

5. **Book a Seat**:

    - Select option `5` to book a seat.
    - Select a train and choose a seat from the available options.

6. **Cancel Booking**:

    - This feature is to be implemented. Currently, users can manage bookings via the provided options.

7. **Exit**:

    - Select option `7` to exit the application.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure your code adheres to the coding standards and includes relevant tests.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any queries or issues, please contact [ankushsinghgandhi@gmail.com].

---

Thank you for using the IRCTC Backend Project! Enjoy your train booking experience.
