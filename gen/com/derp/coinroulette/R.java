/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.derp.coinroulette;

public final class R {
    public static final class anim {
        public static final int wheel_spin_anim=0x7f040000;
    }
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarStyle=0x7f010000;
    }
    public static final class bool {
        public static final int dual_pane=0x7f060000;
        public static final int single_pane=0x7f060001;
    }
    public static final class color {
        public static final int black_overlay=0x7f070000;
    }
    public static final class drawable {
        public static final int ic_launcher=0x7f020000;
        public static final int image=0x7f020001;
        public static final int image_mask=0x7f020002;
        public static final int wheel=0x7f020003;
        public static final int wheel_ball=0x7f020004;
    }
    public static final class id {
        public static final int BetlistFragment=0x7f0a0002;
        public static final int balance_layout=0x7f0a0005;
        public static final int bet_list=0x7f0a0001;
        public static final int bet_type_text=0x7f0a000c;
        public static final int button1=0x7f0a000d;
        public static final int button_layout=0x7f0a0007;
        public static final int call_bet_button=0x7f0a000a;
        public static final int confirm_bet=0x7f0a0000;
        public static final int details_frame_layout=0x7f0a0003;
        public static final int fullscreen_content=0x7f0a0006;
        public static final int image=0x7f0a0009;
        public static final int image_areas=0x7f0a0008;
        public static final int spin_wheel_button=0x7f0a000b;
        public static final int wheel_image=0x7f0a0004;
    }
    public static final class layout {
        public static final int activity_confirm_bet=0x7f030000;
        public static final int activity_place_bet=0x7f030001;
        public static final int activity_spinwheel=0x7f030002;
        public static final int activity_table=0x7f030003;
        public static final int fragment_bet_confirm=0x7f030004;
        public static final int fragment_bet_list=0x7f030005;
    }
    public static final class raw {
        public static final int win=0x7f050000;
    }
    public static final class string {
        public static final int app_name=0x7f080000;
        public static final int dummy_button=0x7f080001;
        public static final int dummy_content=0x7f080002;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.

    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.

        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.

    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f090000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f090001;
        public static final int ButtonBar=0x7f090004;
        public static final int ButtonBarButton=0x7f090005;
        public static final int FullscreenActionBarStyle=0x7f090006;
        public static final int FullscreenTheme=0x7f090002;
        public static final int Theme_NoTitle=0x7f090003;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarButtonStyle com.derp.coinroulette:buttonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarStyle com.derp.coinroulette:buttonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_buttonBarButtonStyle
           @see #ButtonBarContainerTheme_buttonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link com.derp.coinroulette.R.attr#buttonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.derp.coinroulette:buttonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link com.derp.coinroulette.R.attr#buttonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.derp.coinroulette:buttonBarStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarStyle = 0;
    };
}
