package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.core.Path.AnonymousClass1;
import com.google.firebase.database.snapshot.ChildKey;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ValidationPath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19362a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19363b;

    public ValidationPath(Path path) {
        this.f19363b = 0;
        path.getClass();
        Path.AnonymousClass1 anonymousClass1 = path.new AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            this.f19362a.add(((ChildKey) anonymousClass1.next()).f19513a);
        }
        this.f19363b = Math.max(1, this.f19362a.size());
        for (int i11 = 0; i11 < this.f19362a.size(); i11++) {
            this.f19363b = d((CharSequence) this.f19362a.get(i11)) + this.f19363b;
        }
        a();
    }

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt <= 127) {
                i12++;
            } else if (cCharAt <= 2047) {
                i12 += 2;
            } else if (Character.isHighSurrogate(cCharAt)) {
                i12 += 4;
                i11++;
            } else {
                i12 += 3;
            }
            i11++;
        }
        return i12;
    }

    public final void a() {
        String string;
        if (this.f19363b > 768) {
            throw new DatabaseException(p0.i(this.f19363b, ").", new StringBuilder("Data has a key path longer than 768 bytes (")));
        }
        ArrayList arrayList = this.f19362a;
        if (arrayList.size() > 32) {
            StringBuilder sb2 = new StringBuilder("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            if (arrayList.size() != 0) {
                StringBuilder sb3 = new StringBuilder("in path '");
                StringBuilder sb4 = new StringBuilder();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (i11 > 0) {
                        sb4.append("/");
                    }
                    sb4.append((String) arrayList.get(i11));
                }
                sb3.append(sb4.toString());
                sb3.append("'");
                string = sb3.toString();
            } else {
                string = BuildConfig.VERSION_NAME;
            }
            sb2.append(string);
            throw new DatabaseException(sb2.toString());
        }
    }

    public final void b() {
        ArrayList arrayList = this.f19362a;
        this.f19363b -= d((String) p0.f(1, arrayList));
        if (arrayList.size() > 0) {
            this.f19363b--;
        }
    }

    public final void c(String str) {
        ArrayList arrayList = this.f19362a;
        if (arrayList.size() > 0) {
            this.f19363b++;
        }
        arrayList.add(str);
        this.f19363b = d(str) + this.f19363b;
        a();
    }

    public final void e(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    c(str);
                    e(map.get(str));
                    b();
                }
            }
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i11 = 0; i11 < list.size(); i11++) {
                c(Integer.toString(i11));
                e(list.get(i11));
                b();
            }
        }
    }
}
