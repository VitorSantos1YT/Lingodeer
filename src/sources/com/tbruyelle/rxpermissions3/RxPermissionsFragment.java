package com.tbruyelle.rxpermissions3;

import android.os.Bundle;
import androidx.fragment.app.k0;
import androidx.fragment.app.p0;
import java.util.HashMap;
import java.util.Map;
import ly.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class RxPermissionsFragment extends k0 {
    private static final int PERMISSIONS_REQUEST_CODE = 42;
    private boolean mLogging;
    private Map<String, b> mSubjects = new HashMap();

    public boolean containsByPermission(String str) {
        return this.mSubjects.containsKey(str);
    }

    public b getSubjectByPermission(String str) {
        return this.mSubjects.get(str);
    }

    public boolean isGranted(String str) {
        p0 activity = getActivity();
        if (activity != null) {
            return activity.checkSelfPermission(str) == 0;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    public boolean isRevoked(String str) {
        p0 activity = getActivity();
        if (activity != null) {
            return activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    @Override // androidx.fragment.app.k0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.k0
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i12 = 0; i12 < strArr.length; i12++) {
            zArr[i12] = shouldShowRequestPermissionRationale(strArr[i12]);
        }
        onRequestPermissionsResult(strArr, iArr, zArr);
    }

    public void requestPermissions(String[] strArr) {
        requestPermissions(strArr, 42);
    }

    public void setLogging(boolean z11) {
        this.mLogging = z11;
    }

    public void setSubjectForPermission(String str, b bVar) {
        this.mSubjects.put(str, bVar);
    }

    public void onRequestPermissionsResult(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            log("onRequestPermissionsResult  " + strArr[i11]);
            b bVar = this.mSubjects.get(strArr[i11]);
            if (bVar == null) {
                return;
            }
            this.mSubjects.remove(strArr[i11]);
            bVar.onNext(new Permission(strArr[i11], iArr[i11] == 0, zArr[i11]));
            bVar.onComplete();
        }
    }

    public void log(String str) {
    }
}
