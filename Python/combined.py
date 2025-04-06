import sklearn
import pandas as pd
import numpy as np



data_df = pd.read_csv("Python/combined.csv")
#print(data_df.head())


x = data_df.drop(['PE'],axis=1).values
#print(x)

y = data_df['PE'].values

#print(y)
from sklearn.model_selection import train_test_split
x_train,x_test,y_train,y_test = train_test_split(x,y,test_size = 0.3,random_state= 0)

from sklearn.linear_model import LinearRegression
ml = LinearRegression()

ml.fit(x_train,y_train)
y_predict=ml.predict(x_test)
print(y_predict)

ml.predict([[8.34,	40.77,	1010.84,	90.01]])
import matplotlib.pyplot as plt
plt.figure(figsize=(10, 6))  # Set figure size
plt.scatter(y_test, y_predict, color='blue', alpha=0.5)
plt.xlabel('Actual')
plt.ylabel('Predicted')
plt.title('Actual Vs. Predicted')
plt.show()


plt.title('Actual Vs. Predicted')
import statmodels
import statsmodels.api as smf
our_model = 'PE ~ AT + V + AP + RH'
our_modelOutput = smf.ols(our_model,data=data_df).fit()
print(our_modelOutput.summary())
