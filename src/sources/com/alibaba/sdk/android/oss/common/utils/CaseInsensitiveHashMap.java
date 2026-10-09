package com.alibaba.sdk.android.oss.common.utils;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class CaseInsensitiveHashMap<k, v> extends HashMap<k, v> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public v get(Object obj) {
        if (obj == null || containsKey(obj) || !(obj instanceof String)) {
            return (v) super.get(obj);
        }
        String lowerCase = ((String) obj).toLowerCase();
        if (containsKey(lowerCase)) {
            return get(lowerCase);
        }
        return null;
    }
}
