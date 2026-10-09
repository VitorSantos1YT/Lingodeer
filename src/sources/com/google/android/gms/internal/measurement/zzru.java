package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import defpackage.e;
import ep.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11926c;

    public zzru(ArrayList arrayList) {
        zztc zztcVar;
        zzsx zzsxVar;
        List<zztc> list = Collections.EMPTY_LIST;
        this.f11924a = new HashMap();
        this.f11925b = new HashMap();
        this.f11926c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzsx zzsxVar2 = (zzsx) it.next();
            if (!TextUtils.isEmpty(zzsxVar2.zzc()) && (zzsxVar = (zzsx) this.f11924a.put(zzsxVar2.zzc(), zzsxVar2)) != null) {
                String canonicalName = zzsxVar.getClass().getCanonicalName();
                String canonicalName2 = zzsxVar2.getClass().getCanonicalName();
                throw new IllegalArgumentException(e.p(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
            }
        }
        for (zztc zztcVar2 : list) {
            if (!TextUtils.isEmpty(zztcVar2.zza()) && (zztcVar = (zztc) this.f11925b.put(zztcVar2.zza(), zztcVar2)) != null) {
                String canonicalName3 = zztcVar.getClass().getCanonicalName();
                String canonicalName4 = zztcVar2.getClass().getCanonicalName();
                throw new IllegalArgumentException(e.p(new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length()), "Cannot to override Transform ", canonicalName3, " with ", canonicalName4));
            }
        }
        this.f11926c.addAll(list);
    }

    public final Object a(Uri uri, zzrt zzrtVar) {
        return zzrtVar.a(b(uri));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzrs b(Uri uri) throws zzsk {
        ImmutableList immutableListS;
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            immutableListS = ImmutableList.s();
        } else {
            String strSubstring = encodedFragment.substring(10);
            Splitter splitterB = Splitter.b("+");
            immutableListS = ImmutableList.m(new Splitter(splitterB.f16386c, true, splitterB.f16384a, splitterB.f16387d).d(strSubstring));
        }
        int size = immutableListS.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str = (String) immutableListS.get(i11);
            Matcher matcher = zzsp.f11954a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            builder2.h(matcher.group(1));
        }
        ImmutableList immutableListJ = builder2.j();
        int size2 = immutableListJ.size();
        for (int i12 = 0; i12 < size2; i12++) {
            String str2 = (String) immutableListJ.get(i12);
            zztc zztcVar = (zztc) this.f11925b.get(str2);
            if (zztcVar == null) {
                String strValueOf = String.valueOf(uri);
                throw new zzsk(e.p(new StringBuilder(String.valueOf(str2).length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
            }
            builder.h(zztcVar);
        }
        ImmutableList immutableListX = builder.j().x();
        zzrr zzrrVar = new zzrr();
        String scheme = uri.getScheme();
        zzsx zzsxVar = (zzsx) this.f11924a.get(scheme);
        if (zzsxVar == null) {
            throw new zzsk(a.e("Requested backend isn't registered: ", scheme));
        }
        zzrrVar.f11915a = zzsxVar;
        zzrrVar.f11917c = this.f11926c;
        zzrrVar.f11916b = immutableListX;
        zzrrVar.f11918d = uri;
        if (!immutableListX.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator<E> listIterator = immutableListX.listIterator(immutableListX.size());
                while (listIterator.hasPrevious()) {
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        zzrrVar.f11919e = uri;
        return new zzrs(zzrrVar);
    }
}
