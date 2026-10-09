package com.liulishuo.filedownloader.exception;

import ew.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class FileDownloadHttpException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22393a;

    /* JADX WARN: Illegal instructions before constructor call */
    public FileDownloadHttpException(int i11, Map map, Map map2) {
        Object[] objArr = {Integer.valueOf(i11), map, map2};
        int i12 = f.f25949a;
        super(String.format(Locale.ENGLISH, "response code error: %d, \n request headers: %s \n response headers: %s", objArr));
        this.f22393a = i11;
        a(map);
        a(map);
    }

    public static HashMap a(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        return map2;
    }
}
