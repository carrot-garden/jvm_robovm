/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIAlertViewDelegate_Protocol/UIAlertViewDelegate/UIAlertViewDelegate.html">UIAlertViewDelegate Protocol Reference</a>
 *   @since Available in iOS 2.0 and later.
 * </div>
 */
public interface /*<name>*/ UIAlertViewDelegate /*</name>*/ /*<implements>*/ extends ObjCProtocol /*</implements>*/ {

    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIAlertViewDelegate_Protocol/UIAlertViewDelegate/UIAlertViewDelegate.html#//apple_ref/occ/intfm/UIAlertViewDelegate/alertViewCancel:">- (void)alertViewCancel:(UIAlertView *)alertView</a>
     * @since Available in iOS 2.0 and later.
     */
    void cancel(UIAlertView alertView);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIAlertViewDelegate_Protocol/UIAlertViewDelegate/UIAlertViewDelegate.html#//apple_ref/occ/intfm/UIAlertViewDelegate/alertView:clickedButtonAtIndex:">- (void)alertView:(UIAlertView *)alertView clickedButtonAtIndex:(NSInteger)buttonIndex</a>
     * @since Available in iOS 2.0 and later.
     */
    void clicked(UIAlertView alertView, int buttonIndex);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIAlertViewDelegate_Protocol/UIAlertViewDelegate/UIAlertViewDelegate.html#//apple_ref/occ/intfm/UIAlertViewDelegate/alertView:didDismissWithButtonIndex:">- (void)alertView:(UIAlertView *)alertView didDismissWithButtonIndex:(NSInteger)buttonIndex</a>
     * @since Available in iOS 2.0 and later.
     */
    void didDismiss(UIAlertView alertView, int buttonIndex);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIAlertViewDelegate_Protocol/UIAlertViewDelegate/UIAlertViewDelegate.html#//apple_ref/occ/intfm/UIAlertViewDelegate/didPresentAlertView:">- (void)didPresentAlertView:(UIAlertView *)alertView</a>
     * @since Available in iOS 2.0 and later.
     */
    void didPresent(UIAlertView alertView);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIAlertViewDelegate_Protocol/UIAlertViewDelegate/UIAlertViewDelegate.html#//apple_ref/occ/intfm/UIAlertViewDelegate/alertViewShouldEnableFirstOtherButton:">- (BOOL)alertViewShouldEnableFirstOtherButton:(UIAlertView *)alertView</a>
     * @since Available in iOS 5.0 and later.
     */
    boolean shouldEnableFirstOtherButton(UIAlertView alertView);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIAlertViewDelegate_Protocol/UIAlertViewDelegate/UIAlertViewDelegate.html#//apple_ref/occ/intfm/UIAlertViewDelegate/alertView:willDismissWithButtonIndex:">- (void)alertView:(UIAlertView *)alertView willDismissWithButtonIndex:(NSInteger)buttonIndex</a>
     * @since Available in iOS 2.0 and later.
     */
    void willDismiss(UIAlertView alertView, int buttonIndex);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIAlertViewDelegate_Protocol/UIAlertViewDelegate/UIAlertViewDelegate.html#//apple_ref/occ/intfm/UIAlertViewDelegate/willPresentAlertView:">- (void)willPresentAlertView:(UIAlertView *)alertView</a>
     * @since Available in iOS 2.0 and later.
     */
    void willPresent(UIAlertView alertView);
    /*</methods>*/

}