package com.tbruyelle.rxpermissions3;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.a;
import androidx.fragment.app.k0;
import androidx.fragment.app.k1;
import androidx.fragment.app.p0;
import ay.p;
import ay.s;
import ay.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import qx.d;
import qx.h;
import qx.i;
import qx.j;
import vx.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class RxPermissions {
    static final String TAG = "RxPermissions";
    static final Object TRIGGER = new Object();
    Lazy<RxPermissionsFragment> mRxPermissionsFragment;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @FunctionalInterface
    public interface Lazy<V> {
        V get();
    }

    public RxPermissions(p0 p0Var) {
        this.mRxPermissionsFragment = getLazySingleton(p0Var.getSupportFragmentManager());
    }

    private RxPermissionsFragment findRxPermissionsFragment(k1 k1Var) {
        return (RxPermissionsFragment) k1Var.D(TAG);
    }

    private Lazy<RxPermissionsFragment> getLazySingleton(final k1 k1Var) {
        return new Lazy<RxPermissionsFragment>() { // from class: com.tbruyelle.rxpermissions3.RxPermissions.1
            private RxPermissionsFragment rxPermissionsFragment;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tbruyelle.rxpermissions3.RxPermissions.Lazy
            public synchronized RxPermissionsFragment get() {
                try {
                    if (this.rxPermissionsFragment == null) {
                        this.rxPermissionsFragment = RxPermissions.this.getRxPermissionsFragment(k1Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
                return this.rxPermissionsFragment;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RxPermissionsFragment getRxPermissionsFragment(k1 k1Var) {
        RxPermissionsFragment rxPermissionsFragmentFindRxPermissionsFragment = findRxPermissionsFragment(k1Var);
        if (rxPermissionsFragmentFindRxPermissionsFragment != null) {
            return rxPermissionsFragmentFindRxPermissionsFragment;
        }
        RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
        k1Var.getClass();
        a aVar = new a(k1Var);
        aVar.d(0, rxPermissionsFragment, TAG, 1);
        aVar.j();
        return rxPermissionsFragment;
    }

    private h<?> oneOf(h<?> hVar, h<?> hVar2) {
        if (hVar == null) {
            return h.e(TRIGGER);
        }
        Objects.requireNonNull(hVar2, "source2 is null");
        return new w(new i[]{hVar, hVar2}, 0).b(b.f54312a, 2);
    }

    private h<?> pending(String... strArr) {
        for (String str : strArr) {
            if (!this.mRxPermissionsFragment.get().containsByPermission(str)) {
                return s.f3381a;
            }
        }
        return h.e(TRIGGER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h<Permission> requestImplementation(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.mRxPermissionsFragment.get().log("Requesting permission " + str);
            if (isGranted(str)) {
                arrayList.add(h.e(new Permission(str, true, false)));
            } else if (isRevoked(str)) {
                arrayList.add(h.e(new Permission(str, false, false)));
            } else {
                ly.b subjectByPermission = this.mRxPermissionsFragment.get().getSubjectByPermission(str);
                if (subjectByPermission == null) {
                    arrayList2.add(str);
                    subjectByPermission = new ly.b();
                    this.mRxPermissionsFragment.get().setSubjectForPermission(str, subjectByPermission);
                }
                arrayList.add(subjectByPermission);
            }
        }
        if (!arrayList2.isEmpty()) {
            requestPermissionsFromFragment((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        w wVar = new w(arrayList, 1);
        int i11 = d.f48466a;
        b.a(i11, "bufferSize");
        return new p(wVar, i11, gy.d.IMMEDIATE);
    }

    private boolean shouldShowRequestPermissionRationaleImplementation(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (!isGranted(str) && !activity.shouldShowRequestPermissionRationale(str)) {
                return false;
            }
        }
        return true;
    }

    public <T> j ensure(final String... strArr) {
        return new j() { // from class: com.tbruyelle.rxpermissions3.RxPermissions.2
            @Override // qx.j
            public i apply(h<T> hVar) {
                h hVarRequest = RxPermissions.this.request(hVar, strArr);
                int length = strArr.length;
                hVarRequest.getClass();
                gy.b bVar = gy.b.INSTANCE;
                b.a(length, "count");
                b.a(length, "skip");
                Objects.requireNonNull(bVar, "bufferSupplier is null");
                return new ay.h(hVarRequest, length, length, bVar).b(new tx.d() { // from class: com.tbruyelle.rxpermissions3.RxPermissions.2.1
                    @Override // tx.d
                    public i apply(List<Permission> list) {
                        if (list.isEmpty()) {
                            return s.f3381a;
                        }
                        Iterator<Permission> it = list.iterator();
                        while (it.hasNext()) {
                            if (!it.next().granted) {
                                return h.e(Boolean.FALSE);
                            }
                        }
                        return h.e(Boolean.TRUE);
                    }
                }, Integer.MAX_VALUE);
            }
        };
    }

    public <T> j ensureEach(final String... strArr) {
        return new j() { // from class: com.tbruyelle.rxpermissions3.RxPermissions.3
            @Override // qx.j
            public i apply(h<T> hVar) {
                return RxPermissions.this.request(hVar, strArr);
            }
        };
    }

    public <T> j ensureEachCombined(final String... strArr) {
        return new j() { // from class: com.tbruyelle.rxpermissions3.RxPermissions.4
            @Override // qx.j
            public i apply(h<T> hVar) {
                h hVarRequest = RxPermissions.this.request(hVar, strArr);
                int length = strArr.length;
                hVarRequest.getClass();
                gy.b bVar = gy.b.INSTANCE;
                b.a(length, "count");
                b.a(length, "skip");
                Objects.requireNonNull(bVar, "bufferSupplier is null");
                return new ay.h(hVarRequest, length, length, bVar).b(new tx.d() { // from class: com.tbruyelle.rxpermissions3.RxPermissions.4.1
                    @Override // tx.d
                    public i apply(List<Permission> list) {
                        return list.isEmpty() ? s.f3381a : h.e(new Permission(list));
                    }
                }, Integer.MAX_VALUE);
            }
        };
    }

    public boolean isGranted(String str) {
        return !isMarshmallow() || this.mRxPermissionsFragment.get().isGranted(str);
    }

    public boolean isMarshmallow() {
        return true;
    }

    public boolean isRevoked(String str) {
        return isMarshmallow() && this.mRxPermissionsFragment.get().isRevoked(str);
    }

    public void onRequestPermissionsResult(String[] strArr, int[] iArr) {
        this.mRxPermissionsFragment.get().onRequestPermissionsResult(strArr, iArr, new boolean[strArr.length]);
    }

    public h<Boolean> request(String... strArr) {
        return h.e(TRIGGER).a(ensure(strArr));
    }

    public h<Permission> requestEach(String... strArr) {
        return h.e(TRIGGER).a(ensureEach(strArr));
    }

    public h<Permission> requestEachCombined(String... strArr) {
        return h.e(TRIGGER).a(ensureEachCombined(strArr));
    }

    public void requestPermissionsFromFragment(String[] strArr) {
        this.mRxPermissionsFragment.get().log("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.mRxPermissionsFragment.get().requestPermissions(strArr);
    }

    public void setLogging(boolean z11) {
        this.mRxPermissionsFragment.get().setLogging(z11);
    }

    public h<Boolean> shouldShowRequestPermissionRationale(Activity activity, String... strArr) {
        return !isMarshmallow() ? h.e(Boolean.FALSE) : h.e(Boolean.valueOf(shouldShowRequestPermissionRationaleImplementation(activity, strArr)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h<Permission> request(h<?> hVar, final String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return oneOf(hVar, pending(strArr)).b(new tx.d() { // from class: com.tbruyelle.rxpermissions3.RxPermissions.5
            @Override // tx.d
            public h<Permission> apply(Object obj) {
                return RxPermissions.this.requestImplementation(strArr);
            }
        }, Integer.MAX_VALUE);
    }

    public RxPermissions(k0 k0Var) {
        this.mRxPermissionsFragment = getLazySingleton(k0Var.getChildFragmentManager());
    }
}
