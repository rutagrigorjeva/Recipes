val text = "VANILLA CHOCOLATE WITH WHIPPED CREAM\n\n    One cake (1/2 a pound) of Walter Baker & Co.'s Vanilla Sweet Chocolate,\n    4 cups of boiling water,\n    Pinch of salt,\n    4 cups of hot milk.\n\nThis must be made in a double-boiler. Put the chocolate, boiling water\nand salt in upper part of the double-boiler. Stir and beat with a wooden\nspoon until the chocolate is dissolved and smooth. Add the milk and when\nthoroughly hot, strain, and serve with unsweetened whipped cream. More\ncooking will improve it.\n\n\nCHOCOLATE CREAM PIE\n\nLine a pie plate with rich pie crust, putting on an extra edge of crust\nthe same as for custard pie. Fill with the chocolate filling made after\nthe following recipe. Bake in a hot oven until crust is done; remove,\nand when cool, cover with a meringue and brown very slowly in moderate\noven."
val arr = text.toArray

val letters = arr.filter(_.forall(_.isUpper))

val mySeq2 = "[[:upper:]]+".r
arr.filter(item => item matches mySeq2)