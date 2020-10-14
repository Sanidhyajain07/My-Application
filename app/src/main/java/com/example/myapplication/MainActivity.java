package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.text1);
        String para="What is Android?\n" +
                "Who I Am\n" +
                "Android is an open source and Linux-based Operating System for mobile devices such as smartphones and tablet computers. Android was developed by the Open Handset Alliance, led by Google, and other companies.\n" +
                "\n" +
                "Android offers a unified approach to application development for mobile devices which means developers need only develop for Android, and their applications should be able to run on different devices powered by Android.\n" +
                "\n" +
                "The first beta version of the Android Software Development Kit (SDK) was released by Google in 2007 where as the first commercial version, Android 1.0, was released in September 2008.\n" +
                "\n" +
                "On June 27, 2012, at the Google I/O conference, Google announced the next Android version, 4.1 Jelly Bean. Jelly Bean is an incremental update, with the primary aim of improving the user interface, both in terms of functionality and performance.\n" +
                "\n" +
                "The source code for Android is available under free and open source software licenses. Google publishes most of the code under the Apache License version 2.0 and the rest, Linux kernel changes, under the GNU General Public License version 2." +
                "Linux kernel\n" +
                "At the bottom of the layers is Linux - Linux 3.6 with approximately 115 patches. This provides a level of abstraction between the device hardware and it contains all the essential hardware drivers like camera, keypad, display etc. Also, the kernel handles all the things that Linux is really good at such as networking and a vast array of device drivers, which take the pain out of interfacing to peripheral hardware.\n" +
                "\n" +
                "Libraries\n" +
                "On top of Linux kernel there is a set of libraries including open-source Web browser engine WebKit, well known library libc, SQLite database which is a useful repository for storage and sharing of application data, libraries to play and record audio and video, SSL libraries responsible for Internet security etc.\n" +
                "\n" +
                "Android Libraries\n" +
                "This category encompasses those Java-based libraries that are specific to Android development. Examples of libraries in this category include the application framework libraries in addition to those that facilitate user interface building, graphics drawing and database access. A summary of some key core Android libraries available to the Android developer is as follows −\n" +
                "\n" +
                "android.app − Provides access to the application model and is the cornerstone of all Android applications.\n" +
                "\n" +
                "android.content − Facilitates content access, publishing and messaging between applications and application components.\n" +
                "\n" +
                "android.database − Used to access data published by content providers and includes SQLite database management classes.\n" +
                "\n" +
                "android.opengl − A Java interface to the OpenGL ES 3D graphics rendering API.\n" +
                "\n" +
                "android.os − Provides applications with access to standard operating system services including messages, system services and inter-process communication.\n" +
                "\n" +
                "android.text − Used to render and manipulate text on a device display.\n" +
                "\n" +
                "android.view − The fundamental building blocks of application user interfaces.\n" +
                "\n" +
                "android.widget − A rich collection of pre-built user interface components such as buttons, labels, list views, layout managers, radio buttons etc.\n" +
                "\n" +
                "android.webkit − A set of classes intended to allow web-browsing capabilities to be built into applications.\n" +
                "\n" +
                "Having covered the Java-based core libraries in the Android runtime, it is now time to turn our attention to the C/C++ based libraries contained in this layer of the Android software stack.\n" +
                "\n" +
                "Android Runtime\n" +
                "This is the third section of the architecture and available on the second layer from the bottom. This section provides a key component called Dalvik Virtual Machine which is a kind of Java Virtual Machine specially designed and optimized for Android.\n" +
                "\n" +
                "The Dalvik VM makes use of Linux core features like memory management and multi-threading, which is intrinsic in the Java language. The Dalvik VM enables every Android application to run in its own process, with its own instance of the Dalvik virtual machine.\n" +
                "\n" +
                "The Android runtime also provides a set of core libraries which enable Android application developers to write Android applications using standard Java programming language.\n" +
                "\n" +
                "Application Framework\n" +
                "The Application Framework layer provides many higher-level services to applications in the form of Java classes. Application developers are allowed to make use of these services in their applications.\n" +
                "\n" +
                "The Android framework includes the following key services −\n" +
                "\n" +
                "Activity Manager − Controls all aspects of the application lifecycle and activity stack.\n" +
                "\n" +
                "Content Providers − Allows applications to publish and share data with other applications.\n" +
                "\n" +
                "Resource Manager − Provides access to non-code embedded resources such as strings, color settings and user interface layouts.\n" +
                "\n" +
                "Notifications Manager − Allows applications to display alerts and notifications to the user.\n" +
                "\n" +
                "View System − An extensible set of views used to create application user interfaces.";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}