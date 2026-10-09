package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.FacebookButtonBase;
import h9.l0;
import hh.p0;
import java.util.Iterator;
import java.util.List;
import re.m;
import re.s;
import xf.d;
import yf.c;
import yf.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ShareButtonBase extends FacebookButtonBase {
    public static final /* synthetic */ int O = 0;
    public d L;
    public int M;
    public boolean N;

    public ShareButtonBase(Context context, AttributeSet attributeSet, int i11, String str, String str2) {
        super(context, attributeSet, i11, str, str2);
        this.M = 0;
        this.N = false;
        this.M = isInEditMode() ? 0 : getDefaultRequestCode();
        setEnabled(false);
        this.N = false;
    }

    @Override // com.facebook.FacebookButtonBase
    public void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        super.a(context, attributeSet, i11, i12);
        setInternalOnClickListener(getShareOnClickListener());
    }

    public m getCallbackManager() {
        return null;
    }

    public abstract f getDialog();

    @Override // com.facebook.FacebookButtonBase
    public int getRequestCode() {
        return this.M;
    }

    public d getShareContent() {
        return this.L;
    }

    public View.OnClickListener getShareOnClickListener() {
        return new l0(this, 5);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.N = true;
    }

    public void setRequestCode(int i11) {
        int i12 = s.f49210j;
        if (i11 >= i12 && i11 < i12 + 100) {
            throw new IllegalArgumentException(p0.h(i11, "Request code ", " cannot be within the range reserved by the Facebook SDK."));
        }
        this.M = i11;
    }

    public void setShareContent(d dVar) {
        boolean z11;
        this.L = dVar;
        if (this.N) {
            return;
        }
        f dialog = getDialog();
        d shareContent = getShareContent();
        if (dialog.f40069c == null) {
            dialog.f40069c = dialog.c();
        }
        List list = dialog.f40069c;
        kotlin.jvm.internal.m.d(list, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).a(shareContent, false)) {
                z11 = true;
                setEnabled(z11);
                this.N = false;
            }
        }
        z11 = false;
        setEnabled(z11);
        this.N = false;
    }
}
