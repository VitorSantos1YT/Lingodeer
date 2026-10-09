package com.github.javiersantos.piracychecker.enums;

import b7.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import ns.o;
import nv.p;
import oz.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum InstallerID {
    GOOGLE_PLAY("com.android.vending|com.google.android.feedback"),
    AMAZON_APP_STORE("com.amazon.venezia"),
    GALAXY_APPS("com.sec.android.app.samsungapps"),
    HUAWEI_APP_GALLERY("com.huawei.appmarket");

    private final String text;

    InstallerID(String str) {
        this.text = str;
    }

    public final ArrayList a() {
        List listK;
        Collection collectionT;
        if (!q.v0(this.text, "|", false)) {
            return new ArrayList(o.K(this.text));
        }
        String str = this.text;
        Matcher matcher = e0.u(0, "\\|", "compile(...)", str, "input").matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        if (!listK.isEmpty()) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionT = r.f50854a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            collectionT = r.f50854a;
            break;
        }
        Object[] array = collectionT.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        return new ArrayList(o.L((String[]) Arrays.copyOf(strArr, strArr.length)));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.text;
    }
}
