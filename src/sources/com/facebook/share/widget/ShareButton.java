package com.facebook.share.widget;

import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.fragment.app.k0;
import b1.p;
import com.lingodeer.R;
import jh.h;
import kotlin.jvm.internal.m;
import lf.i;
import yf.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ShareButton extends ShareButtonBase {
    public ShareButton(Context context) {
        super(context, null, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    @Override // com.facebook.share.widget.ShareButtonBase, com.facebook.FacebookButtonBase
    public final void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        super.a(context, attributeSet, i11, i12);
        setCompoundDrawablesWithIntrinsicBounds(h.k(getContext(), R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        return i.Share.a();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_button_share;
    }

    @Override // com.facebook.share.widget.ShareButtonBase
    public f getDialog() {
        f fVar;
        if (getFragment() != null) {
            k0 fragment = getFragment();
            int requestCode = getRequestCode();
            m.f(fragment, "fragment");
            fVar = new f(new p(fragment), requestCode);
        } else if (getNativeFragment() != null) {
            Fragment fragment2 = getNativeFragment();
            int requestCode2 = getRequestCode();
            m.f(fragment2, "fragment");
            fVar = new f(new p(fragment2), requestCode2);
        } else {
            fVar = new f(getActivity(), getRequestCode());
        }
        fVar.f40071e = getCallbackManager();
        return fVar;
    }

    public ShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public ShareButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, "fb_share_button_create", "fb_share_button_did_tap");
    }
}
