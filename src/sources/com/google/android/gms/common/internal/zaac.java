package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaac extends RemoteCreator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zaac f8970b = new zaac();

    private zaac() {
    }

    public static View c(Context context, int i11, int i12) throws RemoteCreator.RemoteCreatorException {
        zaac zaacVar = f8970b;
        try {
            zaaa zaaaVar = new zaaa(1, i11, i12, null);
            return (View) ObjectWrapper.j(((zap) zaacVar.b(context)).j(new ObjectWrapper(context), zaaaVar));
        } catch (Exception e8) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 42 + String.valueOf(i12).length());
            sb2.append("Could not get button with size ");
            sb2.append(i11);
            sb2.append(" and color ");
            sb2.append(i12);
            throw new RemoteCreator.RemoteCreatorException(sb2.toString(), e8);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final zap a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zap ? (zap) iInterfaceQueryLocalInterface : new zap(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }
}
