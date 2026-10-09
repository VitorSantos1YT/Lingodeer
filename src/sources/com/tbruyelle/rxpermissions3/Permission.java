package com.tbruyelle.rxpermissions3;

import ay.e;
import ay.g0;
import ay.k;
import ay.w;
import java.util.List;
import java.util.Objects;
import tx.b;
import tx.d;
import vx.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class Permission {
    public final boolean granted;
    public final String name;
    public final boolean shouldShowRequestPermissionRationale;

    public Permission(String str, boolean z11) {
        this(str, z11, false);
    }

    private Boolean combineGranted(List<Permission> list) {
        Objects.requireNonNull(list, "source is null");
        return (Boolean) new e(new w(list, 1), new tx.e() { // from class: com.tbruyelle.rxpermissions3.Permission.3
            @Override // tx.e
            public boolean test(Permission permission) {
                return permission.granted;
            }
        }, 0).j();
    }

    private String combineName(List<Permission> list) {
        Objects.requireNonNull(list, "source is null");
        g0 g0VarF = new w(list, 1).f(new d() { // from class: com.tbruyelle.rxpermissions3.Permission.2
            @Override // tx.d
            public String apply(Permission permission) {
                return permission.name;
            }
        });
        StringBuilder sb2 = new StringBuilder();
        return ((StringBuilder) new k(g0VarF, new a(sb2), new b() { // from class: com.tbruyelle.rxpermissions3.Permission.1
            @Override // tx.b
            public void accept(StringBuilder sb3, String str) {
                if (sb3.length() == 0) {
                    sb3.append(str);
                } else {
                    sb3.append(", ");
                    sb3.append(str);
                }
            }
        }).j()).toString();
    }

    private Boolean combineShouldShowRequestPermissionRationale(List<Permission> list) {
        Objects.requireNonNull(list, "source is null");
        return (Boolean) new e(new w(list, 1), new tx.e() { // from class: com.tbruyelle.rxpermissions3.Permission.4
            @Override // tx.e
            public boolean test(Permission permission) {
                return permission.shouldShowRequestPermissionRationale;
            }
        }, 1).j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Permission permission = (Permission) obj;
        if (this.granted == permission.granted && this.shouldShowRequestPermissionRationale == permission.shouldShowRequestPermissionRationale) {
            return this.name.equals(permission.name);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + (this.granted ? 1 : 0)) * 31) + (this.shouldShowRequestPermissionRationale ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Permission{name='");
        sb2.append(this.name);
        sb2.append("', granted=");
        sb2.append(this.granted);
        sb2.append(", shouldShowRequestPermissionRationale=");
        return ep.a.l(sb2, this.shouldShowRequestPermissionRationale, '}');
    }

    public Permission(String str, boolean z11, boolean z12) {
        this.name = str;
        this.granted = z11;
        this.shouldShowRequestPermissionRationale = z12;
    }

    public Permission(List<Permission> list) {
        this.name = combineName(list);
        this.granted = combineGranted(list).booleanValue();
        this.shouldShowRequestPermissionRationale = combineShouldShowRequestPermissionRationale(list).booleanValue();
    }
}
