# m2m-quality

The goal of this project is to provide tdohe means for assessing and comparing the **quality of M2M (Model-to-Model) transformations**. For this, we introduced a conceptual framework that is supported by different artifacts as well as an appropriate tooling and examples.

Currently, we provide the following:
  1. The extensible **M2M Quality** measurement framework available as Eclipse plugins. Currently, it allows to measure 42 distinct code metrics for QVT-O, QVT-R, and Java/EMF. Available in this GIT repository.
  1. **Literature** providing our conceptual ideas and guidance in conducting empirical measurements in the context of M2M transformations. Available [here](http://www.hni.uni-paderborn.de/en/publications/publikationen/?tx_hnippview_pi1%5Bpublikation%5D=6924).
  1. A set of 14 M2M transformation **scenarios** implemented in each, QVT-O, QVT-R, and Java/EMF (resulting in 42 implementations). Available in this GIT repository.
  1. A **questionnaire** for conducting empirical measurements based on given M2M transformation scenarios. Material available under [Downloads](https://github.com/lehrig/m2m-quality/tree/master/Downloads); online questionnaire at [Google Forms](https://docs.google.com/spreadsheet/viewform?formkey=dDF3X0phQk9BWjVOenZuWlhYb1k0QlE6MQ).
  1. First collected **measurement data** of applying our framework to the 14 M2M transformation scenarios. Here, we focused on maintainability properties. [Downloads](https://github.com/lehrig/m2m-quality/tree/master/Downloads).

The following figure provides a high-level overview of our conceptual framework. A description of it can be found in the Master's thesis ["Assessing the Quality of Model-to-Model Transformations Based on Scenarios"](http://www.hni.uni-paderborn.de/en/publications/publikationen/?tx_hnippview_pi1%5Bpublikation%5D=6924) by Sebastian Lehrig.

<p align='center'>
<img src='https://github.com/lehrig/m2m-quality/tree/master/Downloads/M2MQuality.png' />
</p>
