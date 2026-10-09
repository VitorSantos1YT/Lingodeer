package com.stkouyu.setting;

import com.stkouyu.AudioType;
import com.stkouyu.CoreType;
import com.stkouyu.CustomParam;
import com.stkouyu.Mode;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class RecordSetting {
    private static final String TAG = "17kouyu";
    private int agegroup;
    private String audioPath;
    private Integer audioSource;
    private String audioType;
    private boolean autoRetry;
    private boolean blend_phoneme_enable;
    private int channel;
    private Integer chunkSize;
    private String compress;
    private String coreProvideType;
    private String coreType;
    private String customized_lexicon;
    private String customized_pron;
    private String customized_sig;
    private String customized_sig_url;
    private Integer detect_nonscorable;
    private String dict_dialect;
    private String dict_type;
    private Integer duration;
    private Integer durationInterval;
    private List<String> errIds;
    private boolean forceRecord;
    private boolean isNeedAttachAudioUrlInResult;
    private boolean isNeedPhonemeOutputInWord;
    private boolean isNeedRequestParamsInResult;
    private boolean isNeedSoundIntensity;
    private boolean isNeedWordScoreInParagraph;
    private boolean isStream;
    private boolean isVADEnabled;
    private Integer itn;
    private String keypoints;
    private Double keypoints_weight;
    private String keywords;
    private Integer max_ogg_delay;
    private String mode;
    private boolean muteMusic;
    private String negativeReftext;
    private String negative_keypoints;
    private boolean networkDiagnosis;
    private ArrayList<CustomParam> newParams;
    private Integer output_rawtext;
    private double precision;
    private String protocol;
    private Integer punctuate;
    private int qType;
    private Integer readtype_diagnosis;
    private Integer realtime_feedback;
    private String recordFilePath;
    private String recordName;
    private String refAudio;
    private String refPinyin;
    private String refText;
    private Integer ref_length;
    private String request;
    private int sampleRate;
    private double scale;
    private Integer seek;
    private Integer serverTimeout;
    private double slack;
    private String userId;
    private Integer vad_detction;

    public RecordSetting(String str, String str2) {
        this.audioType = AudioType.WAV;
        this.sampleRate = 16000;
        this.channel = 1;
        this.isNeedAttachAudioUrlInResult = true;
        this.dict_type = "KK";
        this.isNeedPhonemeOutputInWord = true;
        this.scale = 100.0d;
        this.precision = 1.0d;
        this.agegroup = 3;
        this.mode = Mode.SCHOOL;
        this.recordFilePath = BuildConfig.VERSION_NAME;
        this.recordName = BuildConfig.VERSION_NAME;
        this.protocol = BuildConfig.VERSION_NAME;
        this.muteMusic = false;
        this.coreProvideType = BuildConfig.VERSION_NAME;
        this.forceRecord = false;
        this.networkDiagnosis = false;
        this.seek = 60;
        this.ref_length = 0;
        this.autoRetry = false;
        this.errIds = new ArrayList(Arrays.asList("20009", "20027"));
        this.max_ogg_delay = null;
        this.compress = "speex";
        this.output_rawtext = 0;
        this.keypoints = BuildConfig.VERSION_NAME;
        this.negative_keypoints = BuildConfig.VERSION_NAME;
        this.durationInterval = 100;
        this.isVADEnabled = true;
        this.blend_phoneme_enable = false;
        this.readtype_diagnosis = 0;
        this.request = null;
        this.isStream = false;
        this.audioSource = null;
        this.userId = "userId";
        this.coreType = str;
        this.refText = str2;
    }

    public int getAgegroup() {
        return this.agegroup;
    }

    public String getAudioPath() {
        return this.audioPath;
    }

    public Integer getAudioSource() {
        return this.audioSource;
    }

    public String getAudioType() {
        return this.audioType;
    }

    public boolean getBlendPhonemeEnable() {
        return this.blend_phoneme_enable;
    }

    public int getChannel() {
        return this.channel;
    }

    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public String getCompress() {
        return this.compress;
    }

    public String getCoreProvideType() {
        return this.coreProvideType;
    }

    public String getCoreType() {
        return this.coreType;
    }

    public String getCustomized_lexicon() {
        return this.customized_lexicon;
    }

    public String getCustomized_pron() {
        return this.customized_pron;
    }

    public String getCustomized_sig() {
        return this.customized_sig;
    }

    public String getCustomized_sig_url() {
        return this.customized_sig_url;
    }

    public Integer getDetect_nonscorable() {
        return this.detect_nonscorable;
    }

    public String getDict_dialect() {
        return this.dict_dialect;
    }

    public String getDict_type() {
        return this.dict_type;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public Integer getDurationInterval() {
        return this.durationInterval;
    }

    public List<String> getErrIds() {
        return this.errIds;
    }

    public boolean getIsStream() {
        return this.isStream;
    }

    public Integer getItn() {
        return this.itn;
    }

    public String getKeypoints() {
        return this.keypoints;
    }

    public Double getKeypoints_weight() {
        return this.keypoints_weight;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Integer getMax_ogg_delay() {
        return this.max_ogg_delay;
    }

    public String getMode() {
        return this.mode;
    }

    public String getNegativeReftext() {
        return this.negativeReftext;
    }

    public String getNegative_keypoints() {
        return this.negative_keypoints;
    }

    public ArrayList<CustomParam> getNewParams() {
        return this.newParams;
    }

    public Integer getOutput_rawtext() {
        return this.output_rawtext;
    }

    public double getPrecision() {
        return this.precision;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public Integer getPunctuate() {
        return this.punctuate;
    }

    public Integer getReadtypeDiagnosis() {
        return this.readtype_diagnosis;
    }

    public Integer getRealtime_feedback() {
        return this.realtime_feedback;
    }

    public String getRecordFilePath() {
        return this.recordFilePath;
    }

    public String getRecordName() {
        return this.recordName;
    }

    public String getRefAudio() {
        return this.refAudio;
    }

    public String getRefPinyin() {
        return this.refPinyin;
    }

    public String getRefText() {
        return this.refText;
    }

    public Integer getRef_length() {
        return this.ref_length;
    }

    public String getRequest() {
        return this.request;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public Double getScale() {
        return Double.valueOf(this.scale);
    }

    public Integer getSeek() {
        return this.seek;
    }

    public Integer getServerTimeout() {
        return this.serverTimeout;
    }

    public double getSlack() {
        return this.slack;
    }

    public String getUserId() {
        return this.userId;
    }

    public Integer getVad_detction() {
        return this.vad_detction;
    }

    public int getqType() {
        return this.qType;
    }

    public boolean isAutoRetry() {
        return this.autoRetry;
    }

    public boolean isForceRecord() {
        return this.forceRecord;
    }

    public boolean isMuteMusic() {
        return this.muteMusic;
    }

    public boolean isNeedAttachAudioUrlInResult() {
        return this.isNeedAttachAudioUrlInResult;
    }

    public boolean isNeedPhonemeOutputInWord() {
        return this.isNeedPhonemeOutputInWord;
    }

    public boolean isNeedRequestParamsInResult() {
        return this.isNeedRequestParamsInResult;
    }

    public boolean isNeedSoundIntensity() {
        return this.isNeedSoundIntensity;
    }

    public boolean isNeedWordScoreInParagraph() {
        return this.isNeedWordScoreInParagraph;
    }

    public boolean isNetworkDiagnosis() {
        return this.networkDiagnosis;
    }

    public boolean isVADEnabled() {
        return this.isVADEnabled;
    }

    public void setAgegroup(int i11) {
        this.agegroup = i11;
    }

    public RecordSetting setAudioPath(String str) {
        this.audioPath = str;
        return this;
    }

    public void setAudioSource(int i11) {
        this.audioSource = Integer.valueOf(i11);
    }

    public RecordSetting setAudioType(String str) {
        this.audioType = str;
        return this;
    }

    public void setAutoRetry(boolean z11) {
        this.autoRetry = z11;
    }

    public void setBlendPhonemeEnable(boolean z11) {
        this.blend_phoneme_enable = z11;
    }

    public RecordSetting setChannel(int i11) {
        this.channel = i11;
        return this;
    }

    public void setChunkSize(Integer num) {
        this.chunkSize = num;
    }

    public void setCompress(String str) {
        this.compress = str;
    }

    public void setCoreProvideType(String str) {
        this.coreProvideType = str;
    }

    public void setCoreType(String str) {
        this.coreType = str;
    }

    public RecordSetting setCustomized_lexicon(String str) {
        this.customized_lexicon = str;
        return this;
    }

    public void setCustomized_pron(String str) {
        this.customized_pron = str;
    }

    public void setCustomized_sig(String str) {
        this.customized_sig = str;
    }

    public void setCustomized_sig_url(String str) {
        this.customized_sig_url = str;
    }

    public void setDetect_nonscorable(Integer num) {
        this.detect_nonscorable = num;
    }

    public void setDict_dialect(String str) {
        this.dict_dialect = str;
    }

    public RecordSetting setDict_type(String str) {
        this.dict_type = str;
        return this;
    }

    public void setDuration(int i11) {
        this.duration = Integer.valueOf(i11);
    }

    public void setDurationInterval(int i11) {
        this.durationInterval = Integer.valueOf(i11);
    }

    public void setErrIds(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.errIds = list;
    }

    public void setForceRecord(boolean z11) {
        this.forceRecord = z11;
    }

    public void setIsStream(boolean z11) {
        this.isStream = z11;
    }

    public void setItn(int i11) {
        this.itn = Integer.valueOf(i11);
    }

    public void setKeypoints(String str) {
        this.keypoints = str;
    }

    public void setKeypoints_weight(Double d5) {
        this.keypoints_weight = d5;
    }

    public RecordSetting setKeywords(String str) {
        this.keywords = str;
        return this;
    }

    public void setMax_ogg_delay(Integer num) {
        this.max_ogg_delay = num;
    }

    public RecordSetting setMode(String str) {
        this.mode = str;
        return this;
    }

    public void setMuteMusic(boolean z11) {
        this.muteMusic = z11;
    }

    public RecordSetting setNeedAttachAudioUrlInResult(boolean z11) {
        this.isNeedAttachAudioUrlInResult = z11;
        return this;
    }

    public RecordSetting setNeedPhonemeOutputInWord(boolean z11) {
        this.isNeedPhonemeOutputInWord = z11;
        return this;
    }

    public RecordSetting setNeedRequestParamsInResult(boolean z11) {
        this.isNeedRequestParamsInResult = z11;
        return this;
    }

    public RecordSetting setNeedSoundIntensity(boolean z11) {
        this.isNeedSoundIntensity = z11;
        return this;
    }

    public RecordSetting setNeedWordScoreInParagraph(boolean z11) {
        this.isNeedWordScoreInParagraph = z11;
        return this;
    }

    public void setNegativeReftext(String str) {
        this.negativeReftext = str;
    }

    public void setNegative_keypoints(String str) {
        this.negative_keypoints = str;
    }

    public void setNetworkDiagnosis(boolean z11) {
        this.networkDiagnosis = z11;
    }

    public RecordSetting setNewParams(ArrayList<CustomParam> arrayList) {
        this.newParams = arrayList;
        return this;
    }

    public void setOutput_rawtext(Integer num) {
        this.output_rawtext = num;
    }

    public RecordSetting setPrecision(double d5) {
        this.precision = d5;
        return this;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setPunctuate(Integer num) {
        this.punctuate = num;
    }

    public void setReadtypeDiagnosis(Integer num) {
        this.readtype_diagnosis = num;
    }

    public void setRealtime_feedback(Integer num) {
        this.realtime_feedback = num;
    }

    public void setRecordFilePath(String str) {
        this.recordFilePath = str;
    }

    public void setRecordName(String str) {
        this.recordName = str;
    }

    public void setRefAudio(String str) {
        this.refAudio = str;
    }

    public void setRefPinyin(String str) {
        this.refPinyin = str;
    }

    public void setRefText(String str) {
        this.refText = str;
    }

    public void setRef_length(Integer num) {
        this.ref_length = num;
    }

    public void setRequest(String str) {
        this.request = str;
    }

    public RecordSetting setSampleRate(int i11) {
        this.sampleRate = i11;
        return this;
    }

    public RecordSetting setScale(int i11) {
        this.scale = i11;
        return this;
    }

    public RecordSetting setScaleD(double d5) {
        this.scale = d5;
        return this;
    }

    public void setSeek(Integer num) {
        this.seek = num;
    }

    public void setServerTimeout(int i11) {
        this.serverTimeout = Integer.valueOf(i11);
    }

    public RecordSetting setSlack(double d5) {
        this.slack = d5;
        return this;
    }

    public void setUserId(String str) {
        if (str == null || BuildConfig.VERSION_NAME.equals(str)) {
            return;
        }
        this.userId = str;
    }

    public void setVADEnabled(boolean z11) {
        this.isVADEnabled = z11;
    }

    public void setVad_detction(Integer num) {
        this.vad_detction = num;
    }

    public void setqType(int i11) {
        this.qType = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RecordSetting{isNeedSoundIntensity=");
        sb2.append(this.isNeedSoundIntensity);
        sb2.append(", audioType='");
        sb2.append(this.audioType);
        sb2.append("', sampleRate=");
        sb2.append(this.sampleRate);
        sb2.append(", channel=");
        sb2.append(this.channel);
        sb2.append(", audioPath='");
        sb2.append(this.audioPath);
        sb2.append("', coreType='");
        sb2.append(this.coreType);
        sb2.append("', refText='");
        sb2.append(this.refText);
        sb2.append("', refAudio='");
        sb2.append(this.refAudio);
        sb2.append("', isNeedRequestParamsInResult=");
        sb2.append(this.isNeedRequestParamsInResult);
        sb2.append(", isNeedWordScoreInParagraph=");
        sb2.append(this.isNeedWordScoreInParagraph);
        sb2.append(", isNeedAttachAudioUrlInResult=");
        sb2.append(this.isNeedAttachAudioUrlInResult);
        sb2.append(", dict_type='");
        sb2.append(this.dict_type);
        sb2.append("', isNeedPhonemeOutputInWord=");
        sb2.append(this.isNeedPhonemeOutputInWord);
        sb2.append(", scale=");
        sb2.append(this.scale);
        sb2.append(", precision=");
        sb2.append(this.precision);
        sb2.append(", slack=");
        sb2.append(this.slack);
        sb2.append(", keywords='");
        sb2.append(this.keywords);
        sb2.append("', qType=");
        sb2.append(this.qType);
        sb2.append(", agegroup=");
        sb2.append(this.agegroup);
        sb2.append(", customized_lexicon='");
        sb2.append(this.customized_lexicon);
        sb2.append("', mode='");
        sb2.append(this.mode);
        sb2.append("', newParams=");
        sb2.append(this.newParams);
        sb2.append("', blend_phoneme=");
        return a.l(sb2, this.blend_phoneme_enable, '}');
    }

    public RecordSetting(String str, int i11) {
        this.audioType = AudioType.WAV;
        this.sampleRate = 16000;
        this.channel = 1;
        this.isNeedAttachAudioUrlInResult = true;
        this.dict_type = "KK";
        this.isNeedPhonemeOutputInWord = true;
        this.scale = 100.0d;
        this.precision = 1.0d;
        this.agegroup = 3;
        this.mode = Mode.SCHOOL;
        this.recordFilePath = BuildConfig.VERSION_NAME;
        this.recordName = BuildConfig.VERSION_NAME;
        this.protocol = BuildConfig.VERSION_NAME;
        this.muteMusic = false;
        this.coreProvideType = BuildConfig.VERSION_NAME;
        this.forceRecord = false;
        this.networkDiagnosis = false;
        this.seek = 60;
        this.ref_length = 0;
        this.autoRetry = false;
        this.errIds = new ArrayList(Arrays.asList("20009", "20027"));
        this.max_ogg_delay = null;
        this.compress = "speex";
        this.output_rawtext = 0;
        this.keypoints = BuildConfig.VERSION_NAME;
        this.negative_keypoints = BuildConfig.VERSION_NAME;
        this.durationInterval = 100;
        this.isVADEnabled = true;
        this.blend_phoneme_enable = false;
        this.readtype_diagnosis = 0;
        this.request = null;
        this.isStream = false;
        this.audioSource = null;
        this.userId = "userId";
        this.coreType = CoreType.EN_OPEN_EVAL;
        this.refText = str;
        this.qType = i11;
    }

    public RecordSetting(String str) {
        this.audioType = AudioType.WAV;
        this.sampleRate = 16000;
        this.channel = 1;
        this.isNeedAttachAudioUrlInResult = true;
        this.dict_type = "KK";
        this.isNeedPhonemeOutputInWord = true;
        this.scale = 100.0d;
        this.precision = 1.0d;
        this.agegroup = 3;
        this.mode = Mode.SCHOOL;
        this.recordFilePath = BuildConfig.VERSION_NAME;
        this.recordName = BuildConfig.VERSION_NAME;
        this.protocol = BuildConfig.VERSION_NAME;
        this.muteMusic = false;
        this.coreProvideType = BuildConfig.VERSION_NAME;
        this.forceRecord = false;
        this.networkDiagnosis = false;
        this.seek = 60;
        this.ref_length = 0;
        this.autoRetry = false;
        this.errIds = new ArrayList(Arrays.asList("20009", "20027"));
        this.max_ogg_delay = null;
        this.compress = "speex";
        this.output_rawtext = 0;
        this.keypoints = BuildConfig.VERSION_NAME;
        this.negative_keypoints = BuildConfig.VERSION_NAME;
        this.durationInterval = 100;
        this.isVADEnabled = true;
        this.blend_phoneme_enable = false;
        this.readtype_diagnosis = 0;
        this.request = null;
        this.isStream = false;
        this.audioSource = null;
        this.userId = "userId";
        this.coreType = CoreType.EN_ALIGN_EVAL;
        this.refAudio = str;
    }

    public RecordSetting() {
        this.audioType = AudioType.WAV;
        this.sampleRate = 16000;
        this.channel = 1;
        this.isNeedAttachAudioUrlInResult = true;
        this.dict_type = "KK";
        this.isNeedPhonemeOutputInWord = true;
        this.scale = 100.0d;
        this.precision = 1.0d;
        this.agegroup = 3;
        this.mode = Mode.SCHOOL;
        this.recordFilePath = BuildConfig.VERSION_NAME;
        this.recordName = BuildConfig.VERSION_NAME;
        this.protocol = BuildConfig.VERSION_NAME;
        this.muteMusic = false;
        this.coreProvideType = BuildConfig.VERSION_NAME;
        this.forceRecord = false;
        this.networkDiagnosis = false;
        this.seek = 60;
        this.ref_length = 0;
        this.autoRetry = false;
        this.errIds = new ArrayList(Arrays.asList("20009", "20027"));
        this.max_ogg_delay = null;
        this.compress = "speex";
        this.output_rawtext = 0;
        this.keypoints = BuildConfig.VERSION_NAME;
        this.negative_keypoints = BuildConfig.VERSION_NAME;
        this.durationInterval = 100;
        this.isVADEnabled = true;
        this.blend_phoneme_enable = false;
        this.readtype_diagnosis = 0;
        this.request = null;
        this.isStream = false;
        this.audioSource = null;
        this.userId = "userId";
    }
}
