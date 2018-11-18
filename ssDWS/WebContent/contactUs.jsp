<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Contact Us</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">
    <link rel="stylesheet" type="text/css" href="static/lib/bootstrap/dist/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="static/css/site.css" />

</head>

<body>
    <div class="row">
        <div class="col-md-3">
            <h1>Company Name</h1>
            <p>
                <i class="fa fa-globe" aria-hidden="true"></i>
                Fairfield, Iowa, USA
            </p>
            <p>
                <i class="fa fa-phone" aria-hidden="true"></i>
                1-402-432-9789
            </p>
            <p>
                <i class="fa fa-envelope" aria-hidden="true"></i>
                info@company.com
            </p>

        </div>
        <div class="col-md-9">
            <div>
                Please use the following form to send us your comments/enquiries.
                <hr />
            </div>
            <div>
                <!-- <form method="post" action="">
                    <div class="row">
                        <div class="col-md-6">
                            <label>
                                First Name<br><input type="text" name="fname" />
                            </label>
                        </div>
                        <div class="col-md-6">
                            <label>
                                Last Name<br><input type="text" name="lname" />
                            </label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <label>
                                City<br><input type="text" name="city" />
                            </label>
                        </div>
                        <div class="col-md-4">
                            <label>
                                State<br><input type="text" name="state" />
                            </label>
                        </div>
                        <div class="col-md-4">
                            <label>
                                Zip<br><input type="number" name="zip" />
                            </label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label>
                                Email<br><input type="text" name="email" />
                            </label>
                        </div>
                        <div class="col-md-6">
                            <label>
                                Phone<br><input type="text" name="phone" />
                            </label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <label>
                                Message<br><textarea rows="" cols="50" name="comments"></textarea>
                            </label>
                        </div>

                        <div class="col-md-6">
                            <br><button>Submit</button>
                        </div>
                    </div>
                </form> -->

                <form>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="validationDefault01">First name</label>
                            <input type="text" class="form-control" id="validationDefault01" placeholder="First name"
                                value="Mark" required>
                        </div>
                        <div class="col-md-6">
                            <label for="validationDefault02">Last name</label>
                            <input type="text" class="form-control" id="validationDefault02" placeholder="Last name"
                                value="Otto" required>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-4">
                            <label for="validationDefault03">City</label>
                            <input type="text" class="form-control" id="validationDefault03" placeholder="City"
                                required>
                        </div>
                        <div class="col-md-4">
                            <label for="validationDefault04">State</label>
                            <input type="text" class="form-control" id="validationDefault04" placeholder="State"
                                required>
                        </div>
                        <div class="col-md-4">
                            <label for="validationDefault05">Zip</label>
                            <input type="text" class="form-control" id="validationDefault05" placeholder="Zip" required>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-3">
                            <label for="validationDefaultEmail">Email</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="validationDefaultEmail" placeholder="Email"
                                    required>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <label for="validationDefaultPhone">Phone</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="validationDefaultPhone" placeholder="Phone"
                                    required>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-3">
                            <br /><button class="btn btn-primary" type="submit">Submit form</button>
                        </div>
                    </div>
                </form>

            </div>
        </div>
    </div>

</body>

</html>