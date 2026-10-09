package com.lingo.lingoskill.chineseskill.object.speech;

import bq.v;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LsWord implements Comparable<LsWord> {
    public String PY;
    public String SW;
    public String TW;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public int f21743id;
    public List<String> pys = new ArrayList();
    public List<Integer> scores = new ArrayList();
    public List<String> oriPy = new ArrayList();

    public static LsWord create(int i11, JSONObject jSONObject) {
        if (jSONObject.toString().equals("{}")) {
            return null;
        }
        LsWord lsWord = new LsWord();
        lsWord.f21743id = i11;
        lsWord.PY = jSONObject.optString("PY", BuildConfig.VERSION_NAME);
        lsWord.SW = jSONObject.optString("SW", BuildConfig.VERSION_NAME);
        lsWord.TW = jSONObject.optString("TW", BuildConfig.VERSION_NAME);
        lsWord.setPyAndScore();
        return lsWord;
    }

    public void setPyAndScore() {
        this.pys.clear();
        this.scores.clear();
        this.oriPy.clear();
        for (String str : this.PY.replace("_", " ").split("[ ]+")) {
            String strTrim = str.trim();
            if (!strTrim.equals(BuildConfig.VERSION_NAME)) {
                this.oriPy.add(strTrim);
                this.pys.add(v.a(strTrim));
                this.scores.add(-1);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(LsWord lsWord) {
        return this.f21743id - lsWord.f21743id;
    }
}
