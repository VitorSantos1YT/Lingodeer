package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.k0;
import b1.p;
import com.lingodeer.R;
import lf.i;
import lf.j;
import wf.k;
import yf.a;
import yf.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SendButton extends ShareButtonBase {
    public SendButton(Context context) {
        super(context, null, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        return i.Message.a();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_button_send;
    }

    @Override // com.facebook.share.widget.ShareButtonBase
    public f getDialog() {
        a aVar;
        if (getFragment() != null) {
            k0 fragment = getFragment();
            aVar = new a(new p(fragment), getRequestCode());
        } else if (getNativeFragment() != null) {
            Fragment nativeFragment = getNativeFragment();
            aVar = new a(new p(nativeFragment), getRequestCode());
        } else {
            Activity activity = getActivity();
            int requestCode = getRequestCode();
            aVar = new a(activity, requestCode);
            j.f40039b.r(requestCode, new k(requestCode));
        }
        aVar.f40071e = getCallbackManager();
        return aVar;
    }

    public SendButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public SendButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, "fb_send_button_create", "fb_send_button_did_tap");
    }
}
