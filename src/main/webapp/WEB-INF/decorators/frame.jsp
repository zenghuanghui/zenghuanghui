<%--
  Created by IntelliJ IDEA.
  User: zenghuanghui
  Date: 2016/11/13
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE>
<html>
<head>
    <title>
        京辉工作室<sitemesh:write property='title'/> -
    </title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>INSPINIA | Dashboard</title>

    <link href="<%= path%>/inspinia/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%= path%>/inspinia/font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Toastr style -->
    <link href="<%= path%>/inspinia/css/plugins/toastr/toastr.min.css" rel="stylesheet">

    <!-- Gritter -->
    <link href="<%= path%>/inspinia/js/plugins/gritter/jquery.gritter.css" rel="stylesheet">

    <link href="<%= path%>/inspinia/css/animate.css" rel="stylesheet">
    <link href="<%= path%>/inspinia/css/style.css" rel="stylesheet">

    <!-- Mainly scripts -->
    <script src="<%= path%>/inspinia/js/jquery-2.1.1.js"></script>
    <script src="<%= path%>/inspinia/js/bootstrap.min.js"></script>
    <script src="<%= path%>/inspinia/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="<%= path%>/inspinia/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

    <!-- Flot -->
    <script src="<%= path%>/inspinia/js/plugins/flot/jquery.flot.js"></script>
    <script src="<%= path%>/inspinia/js/plugins/flot/jquery.flot.tooltip.min.js"></script>
    <script src="<%= path%>/inspinia/js/plugins/flot/jquery.flot.spline.js"></script>
    <script src="<%= path%>/inspinia/js/plugins/flot/jquery.flot.resize.js"></script>
    <script src="<%= path%>/inspinia/js/plugins/flot/jquery.flot.pie.js"></script>

    <!-- Peity -->
    <script src="<%= path%>/inspinia/js/plugins/peity/jquery.peity.min.js"></script>
    <script src="<%= path%>/inspinia/js/demo/peity-demo.js"></script>

    <!-- Custom and plugin javascript -->
    <script src="<%= path%>/inspinia/js/inspinia.js"></script>
    <script src="<%= path%>/inspinia/js/plugins/pace/pace.min.js"></script>

    <!-- jQuery UI -->
    <script src="<%= path%>/inspinia/js/plugins/jquery-ui/jquery-ui.min.js"></script>

    <!-- GITTER -->
    <script src="<%= path%>/inspinia/js/plugins/gritter/jquery.gritter.min.js"></script>

    <!-- Sparkline -->
    <script src="<%= path%>/inspinia/js/plugins/sparkline/jquery.sparkline.min.js"></script>

    <!-- Sparkline demo data  -->
    <script src="<%= path%>/inspinia/js/demo/sparkline-demo.js"></script>

    <!-- ChartJS-->
    <script src="<%= path%>/inspinia/js/plugins/chartJs/Chart.min.js"></script>

    <!-- Toastr -->
    <script src="<%= path%>/inspinia/js/plugins/toastr/toastr.min.js"></script>
    <sitemesh:write property='head'/>
</head>
<body>
<div id="wrapper">
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav metismenu" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element"> <span>
                            <img alt="image" class="img-circle" src="<%= path%>/inspinia/img/profile_small.jpg"/>
                             </span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                            <span class="clear"> <span class="block m-t-xs"> <strong
                                    class="font-bold">${sessionScope.user.userName}</strong>
                             </span> <span class="text-muted text-xs block">Art Director <b
                                    class="caret"></b></span> </span> </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a href="profile.html">Profile</a></li>
                            <li><a href="contacts.html">Contacts</a></li>
                            <li><a href="mailbox.html">Mailbox</a></li>
                            <li class="divider"></li>
                            <li><a href="login.html">Logout</a></li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        IN+
                    </div>
                </li>
                <li class="active">
                    <a href="index.html"><i class="fa fa-th-large"></i> <span class="nav-label">Dashboards</span> <span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li class="active"><a href="index.html">Dashboard v.1</a></li>
                        <li><a href="dashboard_2.html">Dashboard v.2</a></li>
                        <li><a href="dashboard_3.html">Dashboard v.3</a></li>
                        <li><a href="dashboard_4_1.html">Dashboard v.4</a></li>
                        <li><a href="dashboard_5.html">Dashboard v.5 <span
                                class="label label-primary pull-right">NEW</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="layouts.html"><i class="fa fa-diamond"></i> <span class="nav-label">Layouts</span></a>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-bar-chart-o"></i> <span class="nav-label">Graphs</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="graph_flot.html">Flot Charts</a></li>
                        <li><a href="graph_morris.html">Morris.js Charts</a></li>
                        <li><a href="graph_rickshaw.html">Rickshaw Charts</a></li>
                        <li><a href="graph_chartjs.html">Chart.js</a></li>
                        <li><a href="graph_chartist.html">Chartist</a></li>
                        <li><a href="c3.html">c3 charts</a></li>
                        <li><a href="graph_peity.html">Peity Charts</a></li>
                        <li><a href="graph_sparkline.html">Sparkline Charts</a></li>
                    </ul>
                </li>
                <li>
                    <a href="mailbox.html"><i class="fa fa-envelope"></i> <span class="nav-label">Mailbox </span><span
                            class="label label-warning pull-right">16/24</span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="mailbox.html">Inbox</a></li>
                        <li><a href="mail_detail.html">Email view</a></li>
                        <li><a href="mail_compose.html">Compose email</a></li>
                        <li><a href="email_template.html">Email templates</a></li>
                    </ul>
                </li>
                <li>
                    <a href="metrics.html"><i class="fa fa-pie-chart"></i> <span class="nav-label">Metrics</span> </a>
                </li>
                <li>
                    <a href="widgets.html"><i class="fa fa-flask"></i> <span class="nav-label">Widgets</span></a>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-edit"></i> <span class="nav-label">Forms</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="form_basic.html">Basic form</a></li>
                        <li><a href="form_advanced.html">Advanced Plugins</a></li>
                        <li><a href="form_wizard.html">Wizard</a></li>
                        <li><a href="form_file_upload.html">File Upload</a></li>
                        <li><a href="form_editors.html">Text Editor</a></li>
                        <li><a href="form_markdown.html">Markdown</a></li>
                    </ul>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-desktop"></i> <span class="nav-label">App Views</span> <span
                            class="pull-right label label-primary">SPECIAL</span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="contacts.html">Contacts</a></li>
                        <li><a href="profile.html">Profile</a></li>
                        <li><a href="profile_2.html">Profile v.2</a></li>
                        <li><a href="contacts_2.html">Contacts v.2</a></li>
                        <li><a href="projects.html">Projects</a></li>
                        <li><a href="project_detail.html">Project detail</a></li>
                        <li><a href="teams_board.html">Teams board</a></li>
                        <li><a href="social_feed.html">Social feed</a></li>
                        <li><a href="clients.html">Clients</a></li>
                        <li><a href="full_height.html">Outlook view</a></li>
                        <li><a href="vote_list.html">Vote list</a></li>
                        <li><a href="file_manager.html">File manager</a></li>
                        <li><a href="calendar.html">Calendar</a></li>
                        <li><a href="issue_tracker.html">Issue tracker</a></li>
                        <li><a href="blog.html">Blog</a></li>
                        <li><a href="article.html">Article</a></li>
                        <li><a href="faq.html">FAQ</a></li>
                        <li><a href="timeline.html">Timeline</a></li>
                        <li><a href="pin_board.html">Pin board</a></li>
                    </ul>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-files-o"></i> <span class="nav-label">Other Pages</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="search_results.html">Search results</a></li>
                        <li><a href="lockscreen.html">Lockscreen</a></li>
                        <li><a href="invoice.html">Invoice</a></li>
                        <li><a href="login.html">Login</a></li>
                        <li><a href="login_two_columns.html">Login v.2</a></li>
                        <li><a href="forgot_password.html">Forget password</a></li>
                        <li><a href="register.html">Register</a></li>
                        <li><a href="404.html">404 Page</a></li>
                        <li><a href="500.html">500 Page</a></li>
                        <li><a href="empty_page.html">Empty page</a></li>
                    </ul>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-globe"></i> <span class="nav-label">Miscellaneous</span><span
                            class="label label-info pull-right">NEW</span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="toastr_notifications.html">Notification</a></li>
                        <li><a href="nestable_list.html">Nestable list</a></li>
                        <li><a href="agile_board.html">Agile board</a></li>
                        <li><a href="timeline_2.html">Timeline v.2</a></li>
                        <li><a href="diff.html">Diff</a></li>
                        <li><a href="i18support.html">i18 support</a></li>
                        <li><a href="sweetalert.html">Sweet alert</a></li>
                        <li><a href="idle_timer.html">Idle timer</a></li>
                        <li><a href="truncate.html">Truncate</a></li>
                        <li><a href="spinners.html">Spinners</a></li>
                        <li><a href="tinycon.html">Live favicon</a></li>
                        <li><a href="google_maps.html">Google maps</a></li>
                        <li><a href="code_editor.html">Code editor</a></li>
                        <li><a href="modal_window.html">Modal window</a></li>
                        <li><a href="clipboard.html">Clipboard</a></li>
                        <li><a href="forum_main.html">Forum view</a></li>
                        <li><a href="validation.html">Validation</a></li>
                        <li><a href="tree_view.html">Tree view</a></li>
                        <li><a href="loading_buttons.html">Loading buttons</a></li>
                        <li><a href="chat_view.html">Chat view</a></li>
                        <li><a href="masonry.html">Masonry</a></li>
                        <li><a href="tour.html">Tour</a></li>
                    </ul>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-flask"></i> <span class="nav-label">UI Elements</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="typography.html">Typography</a></li>
                        <li><a href="icons.html">Icons</a></li>
                        <li><a href="draggable_panels.html">Draggable Panels</a></li>
                        <li><a href="resizeable_panels.html">Resizeable Panels</a></li>
                        <li><a href="buttons.html">Buttons</a></li>
                        <li><a href="video.html">Video</a></li>
                        <li><a href="tabs_panels.html">Panels</a></li>
                        <li><a href="tabs.html">Tabs</a></li>
                        <li><a href="notifications.html">Notifications & Tooltips</a></li>
                        <li><a href="badges_labels.html">Badges, Labels, Progress</a></li>
                    </ul>
                </li>

                <li>
                    <a href="grid_options.html"><i class="fa fa-laptop"></i> <span class="nav-label">Grid options</span></a>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-table"></i> <span class="nav-label">Tables</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="table_basic.html">Static Tables</a></li>
                        <li><a href="table_data_tables.html">Data Tables</a></li>
                        <li><a href="table_foo_table.html">Foo Tables</a></li>
                        <li><a href="jq_grid.html">jqGrid</a></li>
                    </ul>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-shopping-cart"></i> <span
                            class="nav-label">E-commerce</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="ecommerce_products_grid.html">Products grid</a></li>
                        <li><a href="ecommerce_product_list.html">Products list</a></li>
                        <li><a href="ecommerce_product.html">Product edit</a></li>
                        <li><a href="ecommerce_product_detail.html">Product detail</a></li>
                        <li><a href="ecommerce-cart.html">Cart</a></li>
                        <li><a href="ecommerce-orders.html">Orders</a></li>
                        <li><a href="ecommerce_payments.html">Credit Card form</a></li>
                    </ul>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-picture-o"></i> <span class="nav-label">Gallery</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="basic_gallery.html">Lightbox Gallery</a></li>
                        <li><a href="slick_carousel.html">Slick Carousel</a></li>
                        <li><a href="carousel.html">Bootstrap Carousel</a></li>

                    </ul>
                </li>
                <li>
                    <a href="index.html#"><i class="fa fa-sitemap"></i> <span class="nav-label">Menu Levels </span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li>
                            <a href="index.html#">Third Level <span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="index.html#">Third Level Item</a>
                                </li>
                                <li>
                                    <a href="index.html#">Third Level Item</a>
                                </li>
                                <li>
                                    <a href="index.html#">Third Level Item</a>
                                </li>

                            </ul>
                        </li>
                        <li><a href="index.html#">Second Level Item</a></li>
                        <li>
                            <a href="index.html#">Second Level Item</a></li>
                        <li>
                            <a href="index.html#">Second Level Item</a></li>
                    </ul>
                </li>
                <li>
                    <a href="css_animation.html"><i class="fa fa-magic"></i> <span
                            class="nav-label">CSS Animations </span><span class="label label-info pull-right">62</span></a>
                </li>
                <li class="landing_link">
                    <a target="_blank" href="landing.html"><i class="fa fa-star"></i> <span class="nav-label">Landing Page</span>
                        <span class="label label-warning pull-right">NEW</span></a>
                </li>
                <li class="special_link">
                    <a href="package.html"><i class="fa fa-database"></i> <span class="nav-label">Package</span></a>
                </li>
            </ul>

        </div>
    </nav>
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="index.html#"><i
                            class="fa fa-bars"></i> </a>
                    <form role="search" class="navbar-form-custom" action="search_results.html">
                        <div class="form-group">
                            <input type="text" placeholder="Search for something..." class="form-control"
                                   name="top-search" id="top-search">
                        </div>
                    </form>
                </div>
                <ul class="nav navbar-top-links navbar-right">
                    <li>
                        <span class="m-r-sm text-muted welcome-message">Welcome to INSPINIA+ Admin Theme.</span>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle count-info" data-toggle="dropdown" href="index.html#">
                            <i class="fa fa-envelope"></i> <span class="label label-warning">16</span>
                        </a>
                        <ul class="dropdown-menu dropdown-messages">
                            <li>
                                <div class="dropdown-messages-box">
                                    <a href="profile.html" class="pull-left">
                                        <img alt="image" class="img-circle" src="<%= path%>/inspinia/img/a7.jpg">
                                    </a>
                                    <div class="media-body">
                                        <small class="pull-right">46h ago</small>
                                        <strong>Mike Loreipsum</strong> started following <strong>Monica Smith</strong>.
                                        <br>
                                        <small class="text-muted">3 days ago at 7:58 pm - 10.06.2014</small>
                                    </div>
                                </div>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="dropdown-messages-box">
                                    <a href="profile.html" class="pull-left">
                                        <img alt="image" class="img-circle" src="<%= path%>/inspinia/img/a4.jpg">
                                    </a>
                                    <div class="media-body ">
                                        <small class="pull-right text-navy">5h ago</small>
                                        <strong>Chris Johnatan Overtunk</strong> started following <strong>Monica
                                        Smith</strong>. <br>
                                        <small class="text-muted">Yesterday 1:21 pm - 11.06.2014</small>
                                    </div>
                                </div>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="dropdown-messages-box">
                                    <a href="profile.html" class="pull-left">
                                        <img alt="image" class="img-circle" src="<%= path%>/inspinia/img/profile.jpg">
                                    </a>
                                    <div class="media-body ">
                                        <small class="pull-right">23h ago</small>
                                        <strong>Monica Smith</strong> love <strong>Kim Smith</strong>. <br>
                                        <small class="text-muted">2 days ago at 2:30 am - 11.06.2014</small>
                                    </div>
                                </div>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="text-center link-block">
                                    <a href="mailbox.html">
                                        <i class="fa fa-envelope"></i> <strong>Read All Messages</strong>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle count-info" data-toggle="dropdown" href="index.html#">
                            <i class="fa fa-bell"></i> <span class="label label-primary">8</span>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="mailbox.html">
                                    <div>
                                        <i class="fa fa-envelope fa-fw"></i> You have 16 messages
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="profile.html">
                                    <div>
                                        <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                        <span class="pull-right text-muted small">12 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="grid_options.html">
                                    <div>
                                        <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="text-center link-block">
                                    <a href="notifications.html">
                                        <strong>See All Alerts</strong>
                                        <i class="fa fa-angle-right"></i>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>


                    <li>
                        <a href="login.html">
                            <i class="fa fa-sign-out"></i> Log out
                        </a>
                    </li>
                    <li>
                        <a class="right-sidebar-toggle">
                            <i class="fa fa-tasks"></i>
                        </a>
                    </li>
                </ul>

            </nav>
        </div>
        <div class="row  border-bottom white-bg dashboard-header">

            <div class="col-sm-3">
                <h2>Welcome Amelia</h2>
                <small>You have 42 messages and 6 notifications.</small>
                <ul class="list-group clear-list m-t">
                    <li class="list-group-item fist-item">
                                <span class="pull-right">
                                    09:00 pm
                                </span>
                        <span class="label label-success">1</span> Please contact me
                    </li>
                    <li class="list-group-item">
                                <span class="pull-right">
                                    10:16 am
                                </span>
                        <span class="label label-info">2</span> Sign a contract
                    </li>
                    <li class="list-group-item">
                                <span class="pull-right">
                                    08:22 pm
                                </span>
                        <span class="label label-primary">3</span> Open new shop
                    </li>
                    <li class="list-group-item">
                                <span class="pull-right">
                                    11:06 pm
                                </span>
                        <span class="label label-default">4</span> Call back to Sylvia
                    </li>
                    <li class="list-group-item">
                                <span class="pull-right">
                                    12:00 am
                                </span>
                        <span class="label label-primary">5</span> Write a letter to Sandra
                    </li>
                </ul>
            </div>
            <div class="col-sm-6">
                <div class="flot-chart dashboard-chart">
                    <div class="flot-chart-content" id="flot-dashboard-chart"></div>
                </div>
                <div class="row text-left">
                    <div class="col-xs-4">
                        <div class=" m-l-md">
                            <span class="h4 font-bold m-t block">$ 406,100</span>
                            <small class="text-muted m-b block">Sales marketing report</small>
                        </div>
                    </div>
                    <div class="col-xs-4">
                        <span class="h4 font-bold m-t block">$ 150,401</span>
                        <small class="text-muted m-b block">Annual sales revenue</small>
                    </div>
                    <div class="col-xs-4">
                        <span class="h4 font-bold m-t block">$ 16,822</span>
                        <small class="text-muted m-b block">Half-year revenue margin</small>
                    </div>

                </div>
            </div>
            <div class="col-sm-3">
                <div class="statistic-box">
                    <h4>
                        Project Beta progress
                    </h4>
                    <p>
                        You have two project with not compleated task.
                    </p>
                    <div class="row text-center">
                        <div class="col-lg-6">
                            <canvas id="polarChart" width="80" height="80"></canvas>
                            <h5>Kolter</h5>
                        </div>
                        <div class="col-lg-6">
                            <canvas id="doughnutChart" width="78" height="78"></canvas>
                            <h5>Maxtor</h5>
                        </div>
                    </div>
                    <div class="m-t">
                        <small>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</small>
                    </div>

                </div>
            </div>

        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="wrapper wrapper-content">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="ibox float-e-margins">
                                <div class="ibox-title">
                                    <h5>New data for the report</h5> <span class="label label-primary">IN+</span>
                                    <div class="ibox-tools">
                                        <a class="collapse-link">
                                            <i class="fa fa-chevron-up"></i>
                                        </a>
                                        <a class="dropdown-toggle" data-toggle="dropdown" href="index.html#">
                                            <i class="fa fa-wrench"></i>
                                        </a>
                                        <ul class="dropdown-menu dropdown-user">
                                            <li><a href="index.html#">Config option 1</a>
                                            </li>
                                            <li><a href="index.html#">Config option 2</a>
                                            </li>
                                        </ul>
                                        <a class="close-link">
                                            <i class="fa fa-times"></i>
                                        </a>
                                    </div>
                                </div>
                                <div class="ibox-content">
                                    <div>

                                        <div class="pull-right text-right">

                                            <span class="bar_dashboard">5,3,9,6,5,9,7,3,5,2,4,7,3,2,7,9,6,4,5,7,3,2,1,0,9,5,6,8,3,2,1</span>
                                            <br/>
                                            <small class="font-bold">$ 20 054.43</small>
                                        </div>
                                        <h4>NYS report new data!
                                            <br/>
                                            <small class="m-r"><a href="graph_flot.html"> Check the stock price! </a>
                                            </small>
                                        </h4>
                                    </div>
                                </div>
                            </div>
                            <div class="ibox float-e-margins">
                                <div class="ibox-title">
                                    <h5>Read below comments</h5>
                                    <div class="ibox-tools">
                                        <a class="collapse-link">
                                            <i class="fa fa-chevron-up"></i>
                                        </a>
                                        <a class="dropdown-toggle" data-toggle="dropdown" href="index.html#">
                                            <i class="fa fa-wrench"></i>
                                        </a>
                                        <ul class="dropdown-menu dropdown-user">
                                            <li><a href="index.html#">Config option 1</a>
                                            </li>
                                            <li><a href="index.html#">Config option 2</a>
                                            </li>
                                        </ul>
                                        <a class="close-link">
                                            <i class="fa fa-times"></i>
                                        </a>
                                    </div>
                                </div>
                                <div class="ibox-content no-padding">
                                    <ul class="list-group">
                                        <li class="list-group-item">
                                            <p><a class="text-info" href="index.html#">@Alan Marry</a> I belive that.
                                                Lorem Ipsum is simply dummy text of the printing and typesetting
                                                industry.</p>
                                            <small class="block text-muted"><i class="fa fa-clock-o"></i> 1 minuts ago
                                            </small>
                                        </li>
                                        <li class="list-group-item">
                                            <p><a class="text-info" href="index.html#">@Stock Man</a> Check this stock
                                                chart. This price is crazy! </p>
                                            <div class="text-center m">
                                                <span id="sparkline8"></span>
                                            </div>
                                            <small class="block text-muted"><i class="fa fa-clock-o"></i> 2 hours ago
                                            </small>
                                        </li>
                                        <li class="list-group-item">
                                            <p><a class="text-info" href="index.html#">@Kevin Smith</a> Lorem ipsum
                                                unknown printer took a galley </p>
                                            <small class="block text-muted"><i class="fa fa-clock-o"></i> 2 minuts ago
                                            </small>
                                        </li>
                                        <li class="list-group-item ">
                                            <p><a class="text-info" href="index.html#">@Jonathan Febrick</a> The
                                                standard chunk of Lorem Ipsum</p>
                                            <small class="block text-muted"><i class="fa fa-clock-o"></i> 1 hour ago
                                            </small>
                                        </li>
                                        <li class="list-group-item">
                                            <p><a class="text-info" href="index.html#">@Alan Marry</a> I belive that.
                                                Lorem Ipsum is simply dummy text of the printing and typesetting
                                                industry.</p>
                                            <small class="block text-muted"><i class="fa fa-clock-o"></i> 1 minuts ago
                                            </small>
                                        </li>
                                        <li class="list-group-item">
                                            <p><a class="text-info" href="index.html#">@Kevin Smith</a> Lorem ipsum
                                                unknown printer took a galley </p>
                                            <small class="block text-muted"><i class="fa fa-clock-o"></i> 2 minuts ago
                                            </small>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="ibox float-e-margins">
                                <div class="ibox-title">
                                    <h5>Your daily feed</h5>
                                    <div class="ibox-tools">
                                        <span class="label label-warning-light pull-right">10 Messages</span>
                                    </div>
                                </div>
                                <div class="ibox-content">

                                    <div>
                                        <div class="feed-activity-list">

                                            <div class="feed-element">
                                                <a href="profile.html" class="pull-left">
                                                    <img alt="image" class="img-circle"
                                                         src="<%= path%>/inspinia/img/profile.jpg">
                                                </a>
                                                <div class="media-body ">
                                                    <small class="pull-right">5m ago</small>
                                                    <strong>Monica Smith</strong> posted a new blog. <br>
                                                    <small class="text-muted">Today 5:60 pm - 12.06.2014</small>

                                                </div>
                                            </div>

                                            <div class="feed-element">
                                                <a href="profile.html" class="pull-left">
                                                    <img alt="image" class="img-circle"
                                                         src="<%= path%>/inspinia/img/a2.jpg">
                                                </a>
                                                <div class="media-body ">
                                                    <small class="pull-right">2h ago</small>
                                                    <strong>Mark Johnson</strong> posted message on <strong>Monica
                                                    Smith</strong> site. <br>
                                                    <small class="text-muted">Today 2:10 pm - 12.06.2014</small>
                                                </div>
                                            </div>
                                            <div class="feed-element">
                                                <a href="profile.html" class="pull-left">
                                                    <img alt="image" class="img-circle"
                                                         src="<%= path%>/inspinia/img/a3.jpg">
                                                </a>
                                                <div class="media-body ">
                                                    <small class="pull-right">2h ago</small>
                                                    <strong>Janet Rosowski</strong> add 1 photo on <strong>Monica
                                                    Smith</strong>. <br>
                                                    <small class="text-muted">2 days ago at 8:30am</small>
                                                </div>
                                            </div>
                                            <div class="feed-element">
                                                <a href="profile.html" class="pull-left">
                                                    <img alt="image" class="img-circle"
                                                         src="<%= path%>/inspinia/img/a4.jpg">
                                                </a>
                                                <div class="media-body ">
                                                    <small class="pull-right text-navy">5h ago</small>
                                                    <strong>Chris Johnatan Overtunk</strong> started following <strong>Monica
                                                    Smith</strong>. <br>
                                                    <small class="text-muted">Yesterday 1:21 pm - 11.06.2014</small>
                                                    <div class="actions">
                                                        <a class="btn btn-xs btn-white"><i class="fa fa-thumbs-up"></i>
                                                            Like </a>
                                                        <a class="btn btn-xs btn-white"><i class="fa fa-heart"></i> Love</a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="feed-element">
                                                <a href="profile.html" class="pull-left">
                                                    <img alt="image" class="img-circle"
                                                         src="<%= path%>/inspinia/img/a5.jpg">
                                                </a>
                                                <div class="media-body ">
                                                    <small class="pull-right">2h ago</small>
                                                    <strong>Kim Smith</strong> posted message on <strong>Monica
                                                    Smith</strong> site. <br>
                                                    <small class="text-muted">Yesterday 5:20 pm - 12.06.2014</small>
                                                    <div class="well">
                                                        Lorem Ipsum is simply dummy text of the printing and typesetting
                                                        industry. Lorem Ipsum has been the industry's standard dummy
                                                        text ever since the 1500s.
                                                        Over the years, sometimes by accident, sometimes on purpose
                                                        (injected humour and the like).
                                                    </div>
                                                    <div class="pull-right">
                                                        <a class="btn btn-xs btn-white"><i class="fa fa-thumbs-up"></i>
                                                            Like </a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="feed-element">
                                                <a href="profile.html" class="pull-left">
                                                    <img alt="image" class="img-circle"
                                                         src="<%= path%>/inspinia/img/profile.jpg">
                                                </a>
                                                <div class="media-body ">
                                                    <small class="pull-right">23h ago</small>
                                                    <strong>Monica Smith</strong> love <strong>Kim Smith</strong>. <br>
                                                    <small class="text-muted">2 days ago at 2:30 am - 11.06.2014</small>
                                                </div>
                                            </div>
                                            <div class="feed-element">
                                                <a href="profile.html" class="pull-left">
                                                    <img alt="image" class="img-circle"
                                                         src="<%= path%>/inspinia/img/a7.jpg">
                                                </a>
                                                <div class="media-body ">
                                                    <small class="pull-right">46h ago</small>
                                                    <strong>Mike Loreipsum</strong> started following <strong>Monica
                                                    Smith</strong>. <br>
                                                    <small class="text-muted">3 days ago at 7:58 pm - 10.06.2014</small>
                                                </div>
                                            </div>
                                        </div>

                                        <button class="btn btn-primary btn-block m-t"><i class="fa fa-arrow-down"></i>
                                            Show More
                                        </button>

                                    </div>

                                </div>
                            </div>

                        </div>
                        <div class="col-lg-4">
                            <div class="ibox float-e-margins">
                                <div class="ibox-title">
                                    <h5>Alpha project</h5>
                                    <div class="ibox-tools">
                                        <a class="collapse-link">
                                            <i class="fa fa-chevron-up"></i>
                                        </a>
                                        <a class="dropdown-toggle" data-toggle="dropdown" href="index.html#">
                                            <i class="fa fa-wrench"></i>
                                        </a>
                                        <ul class="dropdown-menu dropdown-user">
                                            <li><a href="index.html#">Config option 1</a>
                                            </li>
                                            <li><a href="index.html#">Config option 2</a>
                                            </li>
                                        </ul>
                                        <a class="close-link">
                                            <i class="fa fa-times"></i>
                                        </a>
                                    </div>
                                </div>
                                <div class="ibox-content ibox-heading">
                                    <h3>You have meeting today!</h3>
                                    <small><i class="fa fa-map-marker"></i> Meeting is on 6:00am. Check your schedule to
                                        see detail.
                                    </small>
                                </div>
                                <div class="ibox-content inspinia-timeline">

                                    <div class="timeline-item">
                                        <div class="row">
                                            <div class="col-xs-3 date">
                                                <i class="fa fa-briefcase"></i>
                                                6:00 am
                                                <br/>
                                                <small class="text-navy">2 hour ago</small>
                                            </div>
                                            <div class="col-xs-7 content no-top-border">
                                                <p class="m-b-xs"><strong>Meeting</strong></p>

                                                <p>Conference on the sales results for the previous year. Monica please
                                                    examine sales trends in marketing and products. Below please find
                                                    the current status of the
                                                    sale.</p>

                                                <p><span data-diameter="40" class="updating-chart">5,3,9,6,5,9,7,3,5,2,5,3,9,6,5,9,4,7,3,2,9,8,7,4,5,1,2,9,5,4,7,2,7,7,3,5,2</span>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="timeline-item">
                                        <div class="row">
                                            <div class="col-xs-3 date">
                                                <i class="fa fa-file-text"></i>
                                                7:00 am
                                                <br/>
                                                <small class="text-navy">3 hour ago</small>
                                            </div>
                                            <div class="col-xs-7 content">
                                                <p class="m-b-xs"><strong>Send documents to Mike</strong></p>
                                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting
                                                    industry. Lorem Ipsum has been the industry's standard dummy text
                                                    ever since.</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="timeline-item">
                                        <div class="row">
                                            <div class="col-xs-3 date">
                                                <i class="fa fa-coffee"></i>
                                                8:00 am
                                                <br/>
                                            </div>
                                            <div class="col-xs-7 content">
                                                <p class="m-b-xs"><strong>Coffee Break</strong></p>
                                                <p>
                                                    Go to shop and find some products.
                                                    Lorem Ipsum is simply dummy text of the printing and typesetting
                                                    industry. Lorem Ipsum has been the industry's.
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="timeline-item">
                                        <div class="row">
                                            <div class="col-xs-3 date">
                                                <i class="fa fa-phone"></i>
                                                11:00 am
                                                <br/>
                                                <small class="text-navy">21 hour ago</small>
                                            </div>
                                            <div class="col-xs-7 content">
                                                <p class="m-b-xs"><strong>Phone with Jeronimo</strong></p>
                                                <p>
                                                    Lorem Ipsum has been the industry's standard dummy text ever since.
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="timeline-item">
                                        <div class="row">
                                            <div class="col-xs-3 date">
                                                <i class="fa fa-user-md"></i>
                                                09:00 pm
                                                <br/>
                                                <small>21 hour ago</small>
                                            </div>
                                            <div class="col-xs-7 content">
                                                <p class="m-b-xs"><strong>Go to the doctor dr Smith</strong></p>
                                                <p>
                                                    Find some issue and go to doctor.
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="timeline-item">
                                        <div class="row">
                                            <div class="col-xs-3 date">
                                                <i class="fa fa-comments"></i>
                                                12:50 pm
                                                <br/>
                                                <small class="text-navy">48 hour ago</small>
                                            </div>
                                            <div class="col-xs-7 content">
                                                <p class="m-b-xs"><strong>Chat with Monica and Sandra</strong></p>
                                                <p>
                                                    Web sites still in their infancy. Various versions have evolved over
                                                    the years, sometimes by accident, sometimes on purpose (injected
                                                    humour and the like).
                                                </p>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                <div class="footer">
                    <div class="pull-right">
                        10GB of <strong>250GB</strong> Free.
                    </div>
                    <div>
                        <strong>Copyright</strong> Example Company &copy; 2014-2015
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
</body>
</html>
